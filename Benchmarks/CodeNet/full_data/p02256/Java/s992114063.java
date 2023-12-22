import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(gcd(sc.nextInt(), sc.nextInt()));
    }
    private static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x%y);
    }
}

