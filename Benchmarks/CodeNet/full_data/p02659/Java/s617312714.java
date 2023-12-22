import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        double b = in.nextDouble();
        int bint = (int)Math.round(b * 100);
        long ans = a*bint;
        ans = (long)Math.floor(ans / (double)100.0);
        System.out.println(ans);
    }
}
