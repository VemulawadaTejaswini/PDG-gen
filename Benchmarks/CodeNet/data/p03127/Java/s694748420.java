import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int monster1 = sc.nextInt();

        for (int i = 1; i < n; i++) {
            monster1 = gcd(monster1, sc.nextInt());
        }
        System.out.println(monster1);
    }

    private static int gcd (int a, int b) {
        return (b == 0) ? a : gcd(b, a%b);
    }
}