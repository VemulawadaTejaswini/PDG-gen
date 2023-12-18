import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int W = Integer.parseInt(scan.next());
        int H = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int y = Integer.parseInt(scan.next());
        if (Math.min(x, W - x) * H < Math.min(y, H - y) * W && y != H / 2) {
            System.out.println(Math.min(y, H - y) * W + " " + 0);
        } else if (Math.min(x, W - x) * H > Math.min(y, H - y) * W && x != W / 2) {
            System.out.println(Math.min(x, W - x) * H + " " + 0);
        } else if (Math.min(x, W - x) * H > Math.min(y, H - y) * W && x == W / 2) {
            System.out.println(Math.min(x, W - x) * H + " " + 1);
        } else if (Math.min(x, W - x) * H < Math.min(y, H - y) * W && y == H / 2) {
            System.out.println(Math.min(y, H - y) * W + " " + 1);
        }
    }
}
