import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += in.nextInt() % 2;
        }
        String ans = "YES";
        if (count % 2 == 1) {
            ans = "NO";
        }
        System.out.println(ans);
    }
}