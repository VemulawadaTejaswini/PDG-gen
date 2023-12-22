
import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        String line = new java.util.Scanner(System.in).nextLine();
        String[] number = line.split(" ", 0);
        int w = parseInt(number[0]);
        int h = parseInt(number[1]);
        int x = parseInt(number[2]);
        int y = parseInt(number[3]);
        int r = parseInt(number[4]);
        String ans = CircleInRectangle(w, h, x, y, r);
        System.out.println(ans);
    }

    public static String CircleInRectangle(int w, int h, int x, int y, int r) {
        if (r > 0 && r <= 100) {
            if ((x - r >= 0) && (x + r <= 100) && (x + r ) <= w) {
                if ((y - r >= 0) && (y + r <= 100) && (y + r ) <= h) {
                    return "Yes";
                } else {
                    return "No";
                }
            } else {
                return "No";
            }
        }
        else {
            return "No";
        }
    }
}