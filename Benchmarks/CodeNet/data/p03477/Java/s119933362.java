import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a + b == c + d) {
            System.out.println("Balanced");
        } else {
            System.out.println(a + b > c + d ? "Left" : "Right");
        }
    }
}