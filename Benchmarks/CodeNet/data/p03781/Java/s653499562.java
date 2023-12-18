import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int x = in.nextInt();
        int y = 0;
        for (int i = 0; i <= x; i++) {
            y += i;
            if (y >= x) {
                System.out.println(i);
                break;
            }
        }
    }
}
