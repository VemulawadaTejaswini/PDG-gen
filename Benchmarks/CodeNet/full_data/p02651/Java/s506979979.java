import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];
        for (int i=0; i<t; i++) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int j=0; j<n; j++) {
                a[j] = sc.nextLong();
            }
            String s = sc.next();
            int count1 = 0;
            for (char b : s.toCharArray()) {
                if (b == '1') {
                    count1++;
                }
            }
            int m1 = (int)Math.pow(2, count1);
            long[] x1 = new long[m1];
            int m0 = (int)Math.pow(2, n - count1);
            long[] x0 = new long[m0];
            x0[0] = 0;
            int n1 = 1;
            x1[0] = 0;
            int n0 = 1;
            for (int j=0; j<n; j++) {
                char sj = s.charAt(j);
                if (sj == '0') {
                    for (int k=0; k<n0; k++) {
                        x0[n0+k] = x0[k] ^ a[j];
                    }
                    n0 = n0 * 2;
                } else {
                    for (int k=0; k<n1; k++) {
                        x1[n1+k] = x1[k] ^ a[j];
                    }
                    n1 = n1 * 2;
                }
            }
            for (long x : x1) {
                result[i] = 0;
                boolean noHit = true;
                for (long y : x0) {
                    if (x == y) {
                        noHit = false;
                        break;
                    }
                }
                if (noHit) {
                    result[i] = 1;
                    break;
                }
            }
        }
        for (int r : result) {
            System.out.println(r);
        }
    }
}