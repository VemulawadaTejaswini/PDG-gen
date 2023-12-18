import java.util.Scanner;

public class Main {
    static long MOD = 109+7;
    static int N;
    static long a;
    static long b;
    static long c;
    static long[] H;

    static long calc(long t) {
        long[] h = H.clone();
        for(int i = 0;i < N; i++) h[i] -= t *b;
        for(int i = 0; i < N && t > 0; i++) {
            if(h[i] > 0) {
                t -= (h[i] - 1) / c + 1;
            }
        }
        return t;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        a = sc.nextLong();
        b = sc.nextLong();
        c = a - b;

        H = new long[N];
        long hMax = 0;
        for(int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
            hMax = Math.max(hMax, H[i]);
        }

        long rightT = hMax / b + 1; // always correct
        long leftT = 0; // always impossible

        while(rightT - leftT > 1) {
            long t = (rightT + leftT) / 2;
            long result = calc(t);
            if(result < 0) leftT = t;
            else rightT = t;
        }

        System.out.println(rightT);
    }
}