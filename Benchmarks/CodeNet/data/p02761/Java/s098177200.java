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
        if (N != 1) {
            R[0] = 1;
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
            R[S] = C;
            inputed[S] = true;
        }
        if (N != 1 && inputed[0] == true && R[0] == 0) {
            System.out.println(-1);
            return;
        }
        for (int r : R) {
            System.out.print(r);
        }
        System.out.print("\n");
    }
}
