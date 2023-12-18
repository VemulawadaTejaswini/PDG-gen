import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            if (n % 2 == 0) {
                sb.insert(0, 0);
                n /= -2;
            } else {
                sb.insert(0, 1);
                n = (n - 1) / -2;
            }
        }
        System.out.println(sb.toString());
    }
}