import java.util.*;

public class Main {
static long nCr(long n, long r) {
    long ans = 1L;
    for (int i=1;i<=r;i++) {
        ans = ans*(n-i+1)/i;
    }
    return ans;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        Long[] x = new Long[N];
        for (int i=0;i<N;i++) {
            x[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(x, (o1, o2)->Long.compare(o2, o1));
        long val = x[A-1];
        int before = 0;
        int after = 0;
        for (int i=0;i<A;i++) {
            if (x[i]==val) before++;
        }
        for (int i=A;i<N;i++) {
            if (x[i]==val) after++;
        }

        // mean
        long sum = 0L;
        for (int i=0;i<A;i++) {
            sum += x[i];
        }
        double mean = (double)sum/A;
        System.out.println(mean);
        // System.out.println(nCr(3, 1));
        // count
        if (x[0]!=val) {
            System.out.println(nCr(before+after, before));
        } else { // x[0]==val
            long ans = 0L;
            for (int i=0;i<=B-A;i++) {
                ans += nCr(before+after, before+i);
            }
            System.out.println(ans);
        }
    }
}