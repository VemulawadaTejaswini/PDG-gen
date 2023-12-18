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
        N = scan.nextInt();
        x = new int[N];
        y = new int[N];
        used = new int[N];
        Arrays.fill(used, 0);
        sumLen = 0;


        for(int i = 0; i < N; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }

        int numOfPattern = 1;
        for(int i = N; i > 0; i--) {
            numOfPattern *= i;
        }

        for (int i = 0; i < N; i++) {
            used[i] = 1;
            calc(0, i);
            used[i] = 0;
        }

        os.println(sumLen/numOfPattern);

    }

    static int N;
    static int x[];
    static int y[];
    static int used[];
    static double sumLen = 0;

    static void calc(double len, int prevPos) {
        if (!isAllUsed()) {
            for (int i = 0; i < N; i++) {
                if (used[i] != 1) {
                    used[i] = 1;
                    double diff = (x[i] - x[prevPos]) * (x[i] - x[prevPos]) + (y[i] - y[prevPos]) * (y[i] - y[prevPos]);
                    double dist = Math.sqrt(diff);
                    len += dist;
                    calc(len, i);
                    len -= dist;
                    used[i] = 0;
                }
            }
        } else {
            sumLen += len;
        }
    }

    static boolean isAllUsed() {
        for(int i = 0; i < N; i++) {
            if(used[i] == 0)
                return false;
        }
        return true;
    }
}