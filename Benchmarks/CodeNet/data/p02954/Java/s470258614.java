import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        String S = scan.next();
        int N = S.length();
        char arrayS[] = S.toCharArray();
        int ans[] = new int[N];
        Arrays.fill(ans, 0);

        char prevS = 'R';
        int count = 0;

        for(int i = 0; i < N; i++) {
            if(prevS == 'R' && arrayS[i] == 'L') {
                ans[i-1] = (int) ceil(count / 2.0);
                ans[i] = (int) floor(count / 2.0);
                count = 0;
            }
            else if(arrayS[i] == 'R')
                count++;

            prevS = arrayS[i];
        }

        prevS = 'L';
        count = 0;
        for(int i = N - 1; i >= 0; i--) {
            if(prevS == 'L' && arrayS[i] == 'R') {
                ans[i+1] += ceil(count / 2.0);
                ans[i] += floor(count / 2.0);
                count = 0;
            }
            else if(arrayS[i] == 'L')
                count++;

            prevS = arrayS[i];
        }

        for(int i = 0; ; ) {
            os.print(ans[i]);

            if(++i < N)
                os.print(" ");
            else {
                os.println("");
                return;
            }
        }
    }
}