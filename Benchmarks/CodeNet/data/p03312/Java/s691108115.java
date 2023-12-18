
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if(i>0) {
                b[i] = b[i-1] + a[i];
            } else {
                b[i] = a[i];
            }
        }
        long sum = b[n-1];

        if(sum % 4 == 0) {
            long s4 = sum / 4;
            boolean[] b4 = new boolean[4];
            for(int i=0; i<n; i++) {
                if(b[i] == s4) b4[0] = true;
                if(b[i] == s4 * 2) b4[1] = true;
                if(b[i] == s4 * 3) b4[2] = true;
            }
            if(b4[0] && b4[1] && b4[2]) {
                System.out.println(0);
                return;
            }
        }

        long l = 0;
        long r = 1;
        while(!isValid(n, b, r, sum)) {
            r *= 2;
        }
        while(true) {
            if(r - l == 1) {
                System.out.println(r);
                return;
            }
            long c = (l + r) / 2;
            if(isValid(n, b, c, sum)) {
                r = c;
            } else {
                l = c;
            }
        }
    }

    static boolean isValid(int n, long[] b, long r, long sum) {
         // System.out.println(r);
        long ave = sum / 4;
        for(int i1 = 0; i1 < n - 3; i1++) {
            long s1 = b[i1];
            if(s1 < ave - r) continue;
            if(s1 > ave + r + 1) break;
            long min = s1;
            long max = s1;
            for(int i2 = i1 + 1; i2 < n - 2; i2++) {
                long s2 = b[i2] - b[i1];
                if(max - s2 > r) continue;
                if(s2 - min > r) break;
                if(s2 < ave - r) continue;
                if(s2 > ave + r + 1) break;
                min = Math.min(s1, s2);
                max = Math.max(s1, s2);
                for(int i3 = i2 + 1; i3 < n - 1; i3++) {
                    long s3 = b[i3] - b[i2];
                    if(max - s3 > r) continue;
                    if(s3 - min > r) break;
                    if(s3 < ave - r) continue;
                    if(s3 > ave + r + 1) break;
                    long s4 = b[n-1] - b[i3];
                    long lmin = Math.min(min, Math.min(s3, s4));
                    long lmax = Math.max(max, Math.max(s3, s4));
                    if(lmax - lmin <= r) {
                        return true;
                    }

                }
            }
        }
        return false;
    }

}
