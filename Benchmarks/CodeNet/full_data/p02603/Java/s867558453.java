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

        int n = Integer.parseInt(f.readLine());
        int[] cost = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(f.readLine());
        for (int i = 0; i< n; i++) cost[i] = Integer.parseInt(tokenizer.nextToken());

        int[] boughtButNotSold = new int[n];
        int money = 1000;
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (cost[j] <= cost[i]) {
                    money += boughtButNotSold[j] * cost[i];
                    boughtButNotSold[j] = 0;
                }
            }
            for (int j = i - 1; j >= 0; j--) {
                if (cost[j] > cost[i]) {
                    money += cost[j] * boughtButNotSold[j];
                    boughtButNotSold[j] = 0;
                }
            }

            boughtButNotSold[i] = money / cost[i];
            money %= cost[i];
            //System.out.println(money + " " + Arrays.toString(boughtButNotSold));
        }


        for (int i = 0; i < n; i++) {
            money += boughtButNotSold[i] * cost[i];
        }

        out.println(money);
        out.close();
    }
}