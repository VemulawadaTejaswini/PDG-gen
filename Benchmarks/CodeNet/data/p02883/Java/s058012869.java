import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        long K = scan.nextLong();
        Long A[] = new Long[N];
        Long F[] = new Long[N];

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
        }
        for(int i = 0; i < N; i++) {
            F[i] = scan.nextLong();
        }

        Arrays.sort(A, Comparator.reverseOrder());
        Arrays.sort(F);

        long l = -1;
        long r = 1000000000000l;
        long product = 0;
        long answer = 0;
        while (l+1 < r){
            product = (l + r) / 2;
            long sum = 0;
            for(int i = 0; i < N; i++) {
                sum += Math.max(A[i]-product/F[i], 0);
            }
            if(sum <= K) {
                r = product;
            } else {
                l = product;
            }
        }

        os.println(r);

    }
}