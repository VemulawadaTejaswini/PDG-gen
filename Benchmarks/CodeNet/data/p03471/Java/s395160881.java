import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        for (int i = 0; i <= Y / 10000; i++) {
            for (int j = 0; j <= Y / 5000; j++) {
                int k = N - i - j;
                if (k >= 0 && Y == i * 10000 + 5000 * j + 1000 * k) {
                    System.out.printf("%d %d %d", i, j, k);
                    return;
                }
            }
        }
        System.out.print("-1 -1 -1");
    }
}