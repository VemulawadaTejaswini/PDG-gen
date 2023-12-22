
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
        long ans = 1;
        long A[] = new long[N];
        long max = 1000000000000000000l;

        for(int i = 0; i < N; i++) {
            A[i] = scan.nextLong();
            if(A[i] == 0) {
                os.println(0);
                return;
            }
        }

        for(int i = 0; i < N; i++) {
            long ten = 0;
            long temp = A[i];
            while(temp/10 > 1){
                temp /= 10;
                ten++;
            }
            temp = ans;
            while(temp/10 > 1){
                temp /= 10;
                ten++;
            }
            if(ten > 18) {
                os.println(-1);
                return;
            }
            if(ten == 18) {
                temp = ans;
                while(temp/10 > 1){
                    temp /= 10;
                }
                int ansFirst = (int)temp;
                temp = A[i];
                while(temp/10 > 1){
                    temp /= 10;
                }
                int AFirst = (int)temp;
                if(ansFirst != 1 || AFirst != 1){
                    os.println(-1);
                    return;
                }
            }
            ans *= A[i];
            if(ans > max) {
                os.println(-1);
                return;
            }
        }
        os.println(ans);

    }

}