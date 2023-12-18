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
        long H = scan.nextLong();
        long W = scan.nextLong();
        long ans = 0;
        if(W%2 == 1) {
            if(H%2 == 1){
                ans = W*(H-1)/2 + (W+1)/2;
            } else {
                ans = W*H/2;
            }
        } else {
            ans = W/2*H;
        }

        os.println(ans);
    }


}