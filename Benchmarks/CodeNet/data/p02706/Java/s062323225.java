import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int total = 0;
        for (int i = 0; i < m; i++) {
            total += in.nextInt();
        }

        if (total > n) {
            System.out.println(-1);
        } else {
            System.out.println(n - total);
        }
    }
}
