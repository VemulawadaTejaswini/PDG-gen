
/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DPL_1_B
 */
/**
 * Result: AC
 * TC: O(N^2)
 * SC: O(N)
 */
import java.util.Scanner;

public class Main {

    int capacity;
    int n;
    int[] cost;
    int[] value;
    int[] rowCurr;
    Scanner in = new Scanner(System.in);

    boolean readCase() {
        while (in.hasNext()) {
            n = in.nextInt();
            capacity = in.nextInt();
            cost = new int[n];
            value = new int[n];
            for (int i = 0; i < n; i++) {
                value[i] = in.nextInt();
                cost[i] = in.nextInt();
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Main main = new Main();
        while (main.readCase()) {
            main.solve();
        }
    }

    void solve() {
        rowCurr = new int[capacity + 1];
        for (int numOfItems = 1; numOfItems <= n; numOfItems++) {
            for (int weight = capacity; weight >= cost[numOfItems - 1]; weight--) {
                if (weight >= cost[numOfItems - 1]) {
                    rowCurr[weight] = Math.max(
                            rowCurr[weight - cost[numOfItems - 1]] + value[numOfItems - 1],
                            rowCurr[weight]);
                }
            }
        }
        System.out.println(rowCurr[capacity]);
    }
}