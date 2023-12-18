
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(weight(i, i + 1));
            for (int j = i + 2; j <= n; j++) {
                System.out.print(" " + weight(i, j));
            }
            System.out.println();
        }
    }
    
    int weight(int i, int j) {
        return Integer.lowestOneBit(i ^ j);
    }

    void debug(Object...os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
