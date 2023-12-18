import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = Integer.valueOf(sc.next()) + Integer.valueOf(sc.next());
        int r = Integer.valueOf(sc.next()) + Integer.valueOf(sc.next());
        System.out.println(whichLean(l,r));
        sc.close();
    }

    public static String whichLean(int l, int r) {
        if (l < r) {
            return "Right";
        } else if (l > r) {
            return "Left";
        } else {
            return "Balanced";
        }
    }
}