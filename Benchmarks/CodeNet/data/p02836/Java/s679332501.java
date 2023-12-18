import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }
    
    static final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        String S = scan.next();
        int ans = 0;

        if(S.length() % 2 == 1) {
            for(int i = 0; i < (S.length()-1)/2; i++) {
                if(S.charAt(i) != S.charAt(S.length()-1-i))
                    ans++;
            }
        } else {
            for(int i = 0; i < S.length()/2; i++) {
                if(S.charAt(i) != S.charAt(S.length()-1-i))
                    ans++;
            }
        }
        os.println(ans);
    }
}