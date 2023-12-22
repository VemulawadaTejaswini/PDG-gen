import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            System.out.println(Math.min(a * c + b * d, (a * (c < 5 ? 5 : c) + b * (d < 2 ? 2 : d)) * 8 / 10));
        }
    }
}

