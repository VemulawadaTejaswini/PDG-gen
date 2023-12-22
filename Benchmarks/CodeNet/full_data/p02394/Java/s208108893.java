import java.util.Scanner;
import static java.lang.System.out;

class Collision {
    public static boolean isOutCircleFromRect( int w, int h, int cx, int cy, int cr ) {
        return !(((cx - cr) >= 0) && ((cx + cr) <= w) &&
            ((cy - cr) >= 0) && ((cy + cr) <= h));
    }
}

public class Main {
    public static void main( String... args ) {
        // scan
        Scanner scan = new Scanner( System.in);

        int w = scan.nextInt();
        int h = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();

        out.println(Collision.isOutCircleFromRect(w, h, x, y, r) ? "No" : "Yes");

    }
}