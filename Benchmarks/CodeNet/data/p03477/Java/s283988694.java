import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.valueOf(sc.next());
        int b = Integer.valueOf(sc.next());
        int c = Integer.valueOf(sc.next());
        int d = Integer.valueOf(sc.next());
        int l = a+b;
        int r = c+d;
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