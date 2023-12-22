import java.util.Scanner;

public class Main {
    public static boolean isIncluded(int inW, int inH, int inX, int inY, int inR) {
        int[] buf;
        buf = new int[4];
        buf[0] = inX + inR;
        buf[1] = inX - inR;
        buf[2] = inY + inR;
        buf[3] = inY - inR;

        if (buf[0] > inW || buf[1] < 0 || buf[2] > inH || buf[3] < 0 ) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        int w, h, x, y, r;
        Scanner scan = new Scanner(System.in);
        w = Integer.parseInt(scan.next());
        h = Integer.parseInt(scan.next());
        x = Integer.parseInt(scan.next());
        y = Integer.parseInt(scan.next());
        r = Integer.parseInt(scan.next());

        if (isIncluded(w, h, x, y, r)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

