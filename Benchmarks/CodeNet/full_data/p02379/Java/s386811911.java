import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt(), y1 = scan.nextInt(), x2 = scan.nextInt(), y2 = scan.nextInt();

        double ab = Math.pow((double) (x2 - x1), 2);
        double bc = Math.pow((double) (y2 - y1), 2);
        double abc = ab + bc;
        double ans = Math.sqrt(abc);

        System.out.printf("%9.8f", ans);
    }
}