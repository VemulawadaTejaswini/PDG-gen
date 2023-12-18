import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int x = in.nextInt();
            int y = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int l = Math.abs(x - x2) + Math.abs(y - y2);
            if (x == x2) {
                if (y > y2) {
                    int x3 = x + l;
                    int y3 = y2;
                    int x4 = x3;
                    int y4 = y;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                } else {
                    int x3 = x - l;
                    int y3 = y2;
                    int x4 = x3;
                    int y4 = y;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                }
            } else {
                if (x > x2) {
                    int x3 = x2;
                    int y3 = y - l;
                    int x4 = x;
                    int y4 = y3;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                } else {
                    int x3 = x2;
                    int y3 = y + l;
                    int x4 = x;
                    int y4 = y3;
                    System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
                }
            }
        }
    }
}
