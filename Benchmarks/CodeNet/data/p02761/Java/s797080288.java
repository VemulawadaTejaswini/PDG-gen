import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        int N = Integer.parseInt(l[0]);
        int[] R = new int[N];
        boolean[] inputed = new boolean[N];
        for (int i = 0; i < N; i++) {
            R[i] = 0;
        }
        int M = Integer.parseInt(l[1]);
        for (int i = 0; i < M; i++) {
            String[] lsc = sc.nextLine().split(" ");
            int S = Integer.parseInt(lsc[0]) - 1;
            int C = Integer.parseInt(lsc[1]);
            // 重複条件ちぇっく
            if (inputed[S] && R[S] != C) {
                System.out.println(-1);
                return;
            }
            // 先頭0ちぇっく
            if (C == 0 && S == 0 && N != 1) {
                System.out.println(-1);
                return;
            }
            R[S] = C;
            inputed[S] = true;
        }
        int ret = 0;
        for (int i = 0; i < N; i++) {
            ret += R[i] * (int) Math.pow(10, N - 1 - i);
        }
        System.out.println(ret);
    }
}