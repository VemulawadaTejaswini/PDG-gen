
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int C = scan.nextInt();
        String S = scan.next();

        int l[] = new int[N];
        int r[] = new int[N];

        int day = 1;
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'o') {
                l[i] = day++;
                i += C;
            }
        }

        day = K;
        for(int i = N-1; i >=0 ; i--) {
            if(S.charAt(i) == 'o') {
                r[i] = day--;
                i -= C;
            }
        }

        for(int i = 0; i < N; i++) {
            if(l[i] !=0 && l[i] == r[i])
                os.println(i+1);
        }
    }
}