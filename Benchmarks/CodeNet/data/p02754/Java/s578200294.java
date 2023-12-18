import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0) {
            System.out.println(0);
            return;
        }
        int both = n / (a + b);
        int mod = n % (a + b);
        int ans = a * both + Math.min(mod, a);
        System.out.println(ans);
    }
}