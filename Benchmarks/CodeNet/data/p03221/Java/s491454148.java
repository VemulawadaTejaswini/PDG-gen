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
            for(int j=0;j<6-String.valueOf(P[i]).length();j++){
                System.out.print("0");
            }
            System.out.println(P[i] * 1000000 + Y[i][0]);
        }
    }
}
