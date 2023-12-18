import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        int cost = 0;

        for (int i = 1; i <= N; i++) {

            if (i <= K) {
                cost += X;
            } else {
                cost += Y;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(cost);

        sc.close();
        out.flush();
    }
}