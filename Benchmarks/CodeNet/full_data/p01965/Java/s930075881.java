
import java.io.*;
import java.util.*;

/**
 * AIZU ONLINE JUDGE
 * 2865 Farm Village
 *    2018/02/23
 */
public class Main {

    
    int calc(int N, int[] d, int[] g) {
        
        int[] crop = new int[N];
        
        int sum = 0;
        for(int i = 0; i < N; i++) {
            int bestFrom = 0;
            int bestCost = Integer.MAX_VALUE;
            for(int from = 0; from < N; from++) {
                int cost = 0;
                if (crop[from] >= 2)
                    continue;
                cost += g[from];
                for(int k = Math.min(i, from); k < Math.max(i, from); k++) {
                    cost += d[k];
                }
                if (cost < bestCost) {
                    bestCost = cost;
                    bestFrom = from;
                }
            }
            log.printf("%d from%d cost%d\n", i, bestFrom, bestCost);
            crop[bestFrom]++;
            sum += bestCost;
        }
        return sum;
    }

    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int[] d = new int[N - 1];
        int[] g = new int[N];
        for(int i = 0; i < N - 1; i++) {
            d[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            g[i] = sc.nextInt();
        }

        int n = calc(N, d, g);
        result.printf("%d\n", n);

        sc.close();
        return true;
    }

    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


