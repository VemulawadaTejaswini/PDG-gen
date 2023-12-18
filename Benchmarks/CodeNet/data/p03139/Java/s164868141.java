import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        System.out.println(Math.min(x, y) + " " + (x + y <= n ? 0 : x + y - n));
    }
}
