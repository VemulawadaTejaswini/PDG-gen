
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
        String S = scan.next();
        boolean wasR = false;
        int ans = 0;
        int temp = 0;
        for(int i = 0; i <3; i++) {
            boolean isR = false;
            if(S.charAt(i) == 'R') {
                isR = true;
                if(wasR)
                    temp++;
                else
                    temp = 1;
            } else
                temp = 0;

            wasR = isR;
            ans = Math.max(ans, temp);
        }
        os.println(ans);
    }
}