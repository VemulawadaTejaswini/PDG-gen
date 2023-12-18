import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < h; i++) {
            String a = sc.nextLine();
            System.out.println(a);
            System.out.println(a);
        }
    }
}