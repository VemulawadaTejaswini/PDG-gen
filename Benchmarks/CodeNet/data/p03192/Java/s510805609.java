import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 0; 0 < n; i++) {
            int a = n % 10;
            if (a == 2) {
                ans++;
            }
            n = n / 10;
        }
        System.out.println(ans);
    }
}