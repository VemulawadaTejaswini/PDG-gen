import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] Hs = new long[N + 1];
        int[] t = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            Hs[i] = sc.nextLong();
            t[i] = i;
        }
        for (int i = 1; i <= M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            long ha = Hs[A];
            long hb = Hs[B];
            if (ha < hb) {
                t[A] = 0;
            } else if (hb < ha) {
                t[B] = 0;
            } else {
                t[A] = 0;
                t[B] = 0;
            }
        }
        int count = 0;
        for (int i : t) {
            if (0 < i) {
                count++;
            }
        }
        System.out.println(count);
    }
}