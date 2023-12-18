import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int H = sc.nextInt();
        int W = sc.nextInt();
        System.out.println((H - 1) * (W - 1));
    }
}
