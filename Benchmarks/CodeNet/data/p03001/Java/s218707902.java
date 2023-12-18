import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print((double) h * w / 2);
        System.out.print(" ");
        System.out.println(x + x == w && y + y == h ? 1 : 0);
    }
}
