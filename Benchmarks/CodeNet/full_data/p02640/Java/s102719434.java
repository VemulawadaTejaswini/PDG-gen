
import java.util.*;

public class Main {
    public static boolean solve(int x, int y) {
        for (int i = 0; i <= x; i++) {
            if (2 * i + 4 * (x - i) == y) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(solve(input.nextInt(), input.nextInt()) ? "Yes" : "No");
    }
}
