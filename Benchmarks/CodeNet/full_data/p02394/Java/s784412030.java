import java.util.*;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        if (calc()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    private static boolean calc() {
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        if (r*2 > w || r*2 > h) return false;
        if (x < r || w - r < x) return false;
        if (y < r || h - r < y) return false;
        return true;
    }
}