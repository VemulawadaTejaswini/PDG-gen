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
        long K = scan.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        long mother = 1000000007;
        int big, small;
        long answer = 0;

        for(int i = 0; i < N; i++) {
            small = 0;
            big = 0;
            int target = a[i];
            //smallの個数の計算
            for(int j = 0; j < i; j++) {
                if(target > a[j])
                    small++;
            }
            //bigの個数の計算
            for(int j = i+1; j < N; j++) {
                if(target > a[j])
                    big++;
            }
            big %= mother;
            small %= mother;
            answer += (((((big*(K+1)) % mother)*K/2) % mother) + ((((small*K)% mother)*(K-1)/2) % mother)) % mother;
            answer = answer % mother;
            if(answer < 0) {
                os.println("error");
            }
        }
        os.println(answer);
    }
}