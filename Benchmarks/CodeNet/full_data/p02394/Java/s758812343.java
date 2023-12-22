import java.util.Scanner;
import static java.lang.System.out;

class CircleInARectangle {
    private boolean isContain; // ?????¢????????????????????¨???????????????????????????????????????

    CircleInARectangle(int w, int h, int cx, int cy, int cr) {
        this.isContain = isCircleInRect(w, h, cx, cy, cr);
    }

    @Override
    public String toString() {
        return isContain ? "Yes" : "No";
    }

    private boolean isLineInLine(int al, int ar, int bl, int br) {
        return al >= bl && ar <= br;
    }

    private boolean isCircleInRect(int rw, int rh, int cx, int cy, int cr) {
        return isLineInLine(cx - cr, cx + cr, 0, rw) &&
                isLineInLine(cy - cr, cy - cr, 0, cy);
    }

    public static boolean isOutCircleFromRect( int w, int h, int cx, int cy, int cr ) {
        return !(((cx - cr) >= 0) && ((cx + cr) <= w) &&
            ((cy - cr) >= 0) && ((cy + cr) <= h));
    }
}

public class Main {
    public static void main(String... args ) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();

        out.println(new CircleInARectangle(w, h, x, y, r));
    }
}