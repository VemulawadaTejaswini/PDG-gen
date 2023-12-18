import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        if (a == 7 || a == 5 || a == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}