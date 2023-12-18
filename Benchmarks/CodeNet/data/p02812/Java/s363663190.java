
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
        String S = scan.next();

        int state = 0;
        int ans = 0;
        for(int i = 0; i < N; i++){
            switch (state%3) {
                case 0:
                    if(S.charAt(i) == 'A')
                        state++;
                    break;

                case 1:
                    if(S.charAt(i) == 'B')
                        state++;
                    else
                        state = 0;
                    break;

                case 2:
                    if(S.charAt(i) == 'C')
                        ans++;

                    state++;
                    break;
            }
        }

        os.println(ans);
    }
}