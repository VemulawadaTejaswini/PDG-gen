import java.io.*;
import java.util.Scanner;
 
public class Main {
    public static boolean circleInRec(int W, int H, int x, int y, int r) {
        return x + r <= W && x - r >= 0 && y + r <= H && y - r >= 0;
    }
 
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if (circleInRec(W, H, x, y, r)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
