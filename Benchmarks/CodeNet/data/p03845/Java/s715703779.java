
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] t = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
            total += t[i];
        }

        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int p = in.nextInt();
            int x = in.nextInt();

            int sum = total;
            sum += x;
            sum -= t[p-1];

            System.out.println(sum);
        }
    }

}