import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));

        if (a == max) {
            System.out.println(b * c / 2);
            return ;
        } else if (b == max) {
            System.out.println(a * c / 2);
            return;
        } else {
            System.out.println(a * b / 2);
            return;
        }
    }
}
