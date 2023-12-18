import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int K = sc.nextInt();

            boolean[][] S = new boolean[H][W];
            int[] C = new int[H];
            for (int i = 0; i < H; i++) {
                int c = 0;

                char[] chars = sc.next().toCharArray();
                for (int j = 0; j < W; j++) {
                    if (chars[j] == '#') {
                        S[i][j] = true;
                        c++;
                    }
                }

                C[i] = c;
            }

            String[] ans = new String[H];
            int index = 1;
            for (int i = 0; i < H; i++) {
                if (C[i] == 0) {
                    if (i >= 1) {
                        ans[i] = ans[i - 1];
                    }
                    continue;
                }

                StringBuilder sb = new StringBuilder();
                boolean flag = false;
                for (int j = 0; j < W; j++) {
                    if (S[i][j]) {
                        if (flag) {
                            index++;
                        } else {
                            flag = true;
                        }
                    }
                    sb.append(index).append(" ");
                }
                ans[i] = sb.toString();
                index++;
            }

            for (int i = H - 2; i >= 0; i--) {
                if (ans[i] == null) {
                    ans[i] = ans[i + 1];
                }
            }

            StringBuilder ans2 = new StringBuilder();
            for (int i = 0; i < H; i++) {
                ans2.append(ans[i].substring(0, ans[i].length() - 1)).append("\n");
            }

            System.out.print(ans2.toString());
        }
    }

}
