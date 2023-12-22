import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = gcd(sc.nextInt(), sc.nextInt());
        System.out.println(z);
        sc.close();
    }

    private static int gcd(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }
}

