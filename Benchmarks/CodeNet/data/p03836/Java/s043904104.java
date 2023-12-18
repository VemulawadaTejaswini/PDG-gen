import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            while (true)
                solve(in);
        }
    }

    private static void solve(Scanner in) {
        int sx = in.nextInt(), sy = in.nextInt(), tx = in.nextInt(), ty = in.nextInt();
        String ans = "";

        int dy = ty - sy, dx = tx - sx;
        for (int i = 0; i < dy; i++) {
            ans += U;
        }
        for (int i = 0; i < dx; i++) {
            ans += R;
        }
        for (int i = 0; i < dy; i++) {
            ans += D;
        }
        for (int i = 0; i < dx; i++) {
            ans += L;
        }
        ans += L;
        for (int i = 0; i < dy + 1; i++) {
            ans += U;
        }
        for (int i = 0; i < dx + 1; i++) {
            ans += R;
        }
        ans += D;
        ans += R;
        for (int i = 0; i < dy + 1; i++) {
            ans += D;
        }
        for (int i = 0; i < dx + 1; i++) {
            ans += L;
        }
        ans += U;

        System.out.println(ans);
    }

    static final String U = "U", D = "D", L = "L", R = "R";
}