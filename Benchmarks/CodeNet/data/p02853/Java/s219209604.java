import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = solve(x, y);
        System.out.println(res);
    }

    private static int solve(int x, int y) {
        int[] prices = new int[206];
        prices[0] = 300000;
        prices[1] = 200000;
        prices[2] = 100000;
        if (x == 1 && y == 1) {
            return 1000000;
        }
        return prices[x - 1] + prices[y - 1];
    }
}
