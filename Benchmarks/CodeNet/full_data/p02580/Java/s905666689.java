import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] countH = new int[h];
        int[] countW = new int[w];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int indexH = Integer.parseInt(sc.next()) - 1;
            int indexW = Integer.parseInt(sc.next()) - 1;
            countH[indexH]++;
            countW[indexW]++;
            list.add(indexH + ":" + indexW);
        }
        sc.close();

        // 主処理
        int result = solve(countH, countW, list);

        // 出力
        System.out.println(result);
    }

    private static int solve(int[] countH, int[] countW, List<String> list) {
        int filterH = Arrays.stream(countH).max().orElse(0);
        int filterW = Arrays.stream(countW).max().orElse(0);
        final int MAX = filterH + filterW;

        int result = 0;
        for (int i = 0; i < countH.length; i++) {
            if (filterH <= countH[i]) {
                for (int j = 0; j < countW.length; j++) {
                    if (filterW <= countW[i]) {
                        int minus = list.contains(i + ":" + j) ? 1 : 0;
                        result = Math.max(result, countH[i] + countW[j] - minus);
                        if (MAX == result) {
                            return result;
                        }
                    }
                }
            }
        }
        return result;
    }
}
