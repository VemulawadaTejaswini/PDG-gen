import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (n * i + m * j - 2 * i * j == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

}
