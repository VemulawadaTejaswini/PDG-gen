import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        Scanner scan = new Scanner(is);
        int M = scan.nextInt();
        int D = scan.nextInt();

        if(M < 4 || D < 22) {
            os.println(0);
            return;
        }

        int answer = 0;

        for(int i = 4; i <= M; i++) {
            if(i > 81)
                break;
            for(int j = 22; j <= D; j++) {
                int d10 = j / 10;
                int d1 = j % 10;
                if(d10 >= 2 && d1 >=2 && i == d10 * d1) {
                    answer++;
                }
            }
        }
        os.println(answer);
    }
}