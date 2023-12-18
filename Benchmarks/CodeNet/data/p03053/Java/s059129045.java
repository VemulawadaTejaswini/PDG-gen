import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }
        sc.close();

        // 主処理
        Deque<Integer[]> dq = new ArrayDeque<>();
        boolean isContinue = false;
        int result = 0;
        do {
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (a[i][j] == '.') {
                        boolean isBlack = (0 <= i - 1 && a[i - 1][j] == '#') || (0 <= j - 1 && a[i][j - 1] == '#')
                                || (j + 1 < w && a[i][j + 1] == '#') || (i + 1 < h && a[i + 1][j] == '#');
                        if (isBlack) {
                            dq.add(new Integer[] { i, j });
                        }
                    }
                }
            }
            if (!dq.isEmpty()) {
                isContinue = true;
                result++;
            }
            while (!dq.isEmpty()) {
                Integer[] index = dq.poll();
                a[index[0]][index[1]] = '#';
            }
        } while (isContinue);

        // 出力
        System.out.println(result);
    }
}
