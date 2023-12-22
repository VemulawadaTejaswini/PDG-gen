
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

        for(int i = 1; i <= 10; i++) {
            if(1000 * i >= N){
                os.println(1000*i-N);
                return;
            }
        }
    }
}