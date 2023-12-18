import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int ans = n / (2 * d + 1);
        if (n % 2 * d + 1 != 0) {
            ans++;
        }
        System.out.println(ans);

    }

}
