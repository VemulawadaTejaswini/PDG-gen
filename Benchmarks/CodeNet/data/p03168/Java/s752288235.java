import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Double[] heads = new Double[n];

        for (int i = 0; i < n; i++) {
            heads[i] = Double.parseDouble(st.nextToken());
        }
        moreHeadsProbability(heads);
    }

    public static void moreHeadsProbability(Double[] heads) {
        int n = heads.length;

        //if there is only 1 or 2 coins, the probability of more heads than tails
        // is the probability of flipping all heads
        if (n == 1) {
            System.out.println(heads[0]);
            return;
        }

        if (n == 2) {
            System.out.println(heads[0]*heads[1]);
            return;
        }

        //initialize 2 x (n-1)/2 +1 table for bottom up
        Double[][] soln = new Double[2][((n - 1)/ 2) + 1];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < ((n - 1) / 2) + 1; j++) {
                soln[i][j] = 0D;
            }
        }

        //base case
        soln[0][0] = heads[0];
        soln[0][1] = 1 - heads[0];

        //note we only need the results from n-1 coins, so we don't need to store results for all n coins
        for (int i = 1; i < n; i++) {
            soln[1][0] = soln[0][0] * heads[i];
            for (int j = 1; j <= Math.min(i + 1, (n - 1) / 2); j++) {
                soln[1][j] = soln[0][j] * heads[i] + soln[0][j - 1] * (1 - heads[i]);
            }
            soln[0] = soln[1].clone();
        }
        //add probability of 0 tail to (n-1)/2 tails for n coins
        double sum = 0;
        for (int i = 0; i <= (n - 1) / 2; i++) {
            sum += soln[1][i];
        }
        System.out.println(sum);
    }
}