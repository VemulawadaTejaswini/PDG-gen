import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        List<Integer[]> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] array = new Integer[m + 1];
            array[0] = Integer.parseInt(sc.next());
            for (int j = 1; j <= m; j++) {
                array[j] = Integer.parseInt(sc.next());
            }
            a.add(array);
        }
        sc.close();

        // 主処理
        List<List<Integer>> combinationList = getCombinationList(n);

        int min = Integer.MAX_VALUE;
        for (List<Integer> comb : combinationList) {
            int amount = 0;
            int[] score = new int[m];
            for (int index : comb) {
                amount += a.get(index)[0];
                for (int i = 0; i < m; i++) {
                    score[i] += a.get(index)[i + 1];
                }
            }
            int size = Arrays.stream(score).filter(i -> x <= i).toArray().length;
            if (m == size) {
                min = Math.min(min, amount);
            }
        }

        int result = min == Integer.MAX_VALUE ? -1 : min;

        // 出力
        System.out.println(result);
    }

    public static List<List<Integer>> getCombinationList(int n) {
        List<List<Integer>> combinationList = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((1 & i >> j) == 1) {
                    list.add(j);
                }
            }
            combinationList.add(list);
        }
        return combinationList;
    }
}
