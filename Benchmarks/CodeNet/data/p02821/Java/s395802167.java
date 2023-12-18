import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve(System.in, System.out);
    }

    public void solve(InputStream in, PrintStream out) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        long[] a = new long[n];
        long[] sum = new long[n+1];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++) {
            sum[i+1] = sum[i] + a[i];
        }

        long l = 0;
        long r = a[n-1] * 2 + 1;
        long mid;
        while(l + 1 < r) {
            mid = (l+r)/2;
            long count = 0;
            for(int i=0; i<n; i++) {
                long min = mid - a[i];
                int ind = Arrays.binarySearch(a, min);
                if(ind < 0) {
                    ind = - 1 - ind;
                }
                count += n - ind;
            }
            if(count < m) {
                r = mid;
            } else {
                l = mid;
            }
        }
        long score = 0;
        long count = 0;
        for(int i=0; i<n; i++) {
            long min = l - a[i];
            int ind = Arrays.binarySearch(a, min);
            if(ind < 0) {
                ind = - 1 - ind;
            }
            count += n - ind;
            score += a[i] * (n-ind);
            score += sum[n] - sum[ind];
        }
        score -= (count - m) * l;
        out.println(score);
    }
}