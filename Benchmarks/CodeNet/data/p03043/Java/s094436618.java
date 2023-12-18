import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        double prob = 0;
        for (int i = 1; i <= n; i++) {
            int score = i;
            int numFlips = 0;
            while (score < k) {
                score *= 2;
                numFlips++;
            }
            prob += Math.pow(0.5, numFlips) / n;
        }

        System.out.println(prob);
    }
}
