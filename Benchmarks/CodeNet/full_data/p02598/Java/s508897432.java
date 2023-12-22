import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        new Main().solve();
    }

    private void solve() throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[] logs = new int[n];
        tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0;i  < n; i++) logs[i] = Integer.parseInt(tokenizer.nextToken());

        double a = 1;
        double b = 1000000001;
        while (Math.ceil(a) != Math.ceil(b)) {
            double mid = (a + b) / 2;
            //System.out.println(a + " " + b);
            if (canReach(k, logs, mid)) {
                b = mid;
            } else {
                a = mid;
            }
        }

        out.println((int) Math.ceil(a));
        out.close();
    }

    boolean canReach(int k, int[] logs, double goal) {
        int neededMoves = 0;
        for (int log : logs) {
            neededMoves += Math.ceil(log / goal) - 1;
        }
        return neededMoves <= k;
    }
}