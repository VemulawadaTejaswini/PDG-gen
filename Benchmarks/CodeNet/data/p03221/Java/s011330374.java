import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] pc = new int[N + 1];
        long[] P = new long[M];
        long[][] Y = new long[M][3];
        Arrays.fill(pc, 0);
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextLong();
            Y[i][0] = sc.nextLong();
            Y[i][1] = i;
            Y[i][2] = P[i];
        }
        Arrays.sort(Y, (a, b) -> Long.compare(a[0], b[0]));
        for (int i = 0; i < M; i++) {
            pc[(int) Y[i][2]]++;
            Y[i][0] = pc[(int) Y[i][2]];
        }
        Arrays.sort(Y, (a, b) -> Long.compare(a[1], b[1]));
        for (int i = 0; i < M; i++) {
            if (String.valueOf(P[i]).length() == 2) {
                System.out.print("0000");
            } else if (String.valueOf(P[i]).length() == 3) {
                System.out.print("000");
            } else if (String.valueOf(P[i]).length() == 4) {
                System.out.print("00");
            } else if (String.valueOf(P[i]).length() == 5) {
                System.out.print("0");
            } else if (String.valueOf(P[i]).length() == 1) {
                System.out.print("00000");
            }
            System.out.println(P[i] * 1000000 + Y[i][0]);
        }
    }
}