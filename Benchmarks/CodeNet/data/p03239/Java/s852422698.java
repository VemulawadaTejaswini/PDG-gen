
import java.util.Scanner;

public class Main {
    final static int COST_MAX = 1001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int cost = COST_MAX;

        for (int i = 0; i < N; i ++){
            int c = scanner.nextInt();
            int t = scanner.nextInt();

            if (t <= T){
                cost = Math.min(cost, c);
            }
        }

        if (cost == COST_MAX){
            System.out.println("TLE");
        } else {
            System.out.println(cost);
        }
    }
}
