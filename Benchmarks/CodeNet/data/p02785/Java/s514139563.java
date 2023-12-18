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
        int K = scan.nextInt();
        Integer H[] = new Integer[N];
        for(int i = 0; i < N ; i++) {
            H[i] = new Integer(scan.nextInt());
        }

        Arrays.sort(H, Collections.reverseOrder());

        if(N <= K){
            os.println(0);
            return;
        }

        long ans = 0;
        for(int i = K; i < N; i++)
            ans += H[i];

        os.println(ans);

    }
}