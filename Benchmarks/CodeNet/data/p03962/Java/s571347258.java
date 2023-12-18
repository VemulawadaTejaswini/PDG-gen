import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int ans = 1;
        if (a != b)
            ans++;
        if (a != c && b != c)
            ans++;
        System.out.println(ans);

    }
}