import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (n * i + (m - i * 2) * j == k) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

}
