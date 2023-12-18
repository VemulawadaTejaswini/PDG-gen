import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a500 = sc.nextInt();
        int b100 = sc.nextInt();
        int c50 = sc.nextInt();
        int sum = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= a500; i++) {
            for (int j = 0; j <= b100; j++) {
                int r = (sum - 500 * i - 100 * j) / 50;
                if (r >= 0 && r <= c50) {
                    count++;
                };
            }
        }
        System.out.println(count);
    }
}