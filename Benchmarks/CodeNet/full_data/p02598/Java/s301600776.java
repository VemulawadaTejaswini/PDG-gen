import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        double[] A = new double[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt()+0.005;
        }

        double ok = 10_000_000_000L;
        double ng = 0L;

        while (ok-ng > 0.0000001) {
            double mid = (ok+ng)/2;
            long cnt = 0L;
            for (int i=0;i<N;i++) {
                cnt += Math.floor(A[i]/(mid+0.005));
            }
            // System.out.println("mid, cnt: "+mid+" "+cnt);

            if (cnt > K) {
                ng = mid;
            } else { // cnt <= K
                ok = mid;
            }
        }
        // System.out.println(ok);
        System.out.println((int)(Math.ceil(ok-0.005)));
    }
}