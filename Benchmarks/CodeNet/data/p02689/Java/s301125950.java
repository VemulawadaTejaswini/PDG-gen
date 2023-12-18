import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] Hs = new long[N + 1];
        boolean[] t = new boolean[N + 1];
        for (int i = 1; i <= M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            long ha = Hs[A];
            long hb = Hs[B];
            if (ha < hb) {
                t[A] = true;
            } else if (hb < ha) {
                t[B] = true;
            } else {
                t[A] = true;
                t[B] = true;
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            count += t[i] ? 0 : 1;
        }
        System.out.println(count);
    }
}