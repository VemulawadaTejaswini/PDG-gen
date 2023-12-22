import java.util.*;

public class Main {
	public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        
        double N = sc.nextDouble(); // 数列
        double Q = sc.nextDouble(); // クエリ

        sc.nextLine();

        sc.close();

        double ans = (double) Math.floor( N*Q );

        System.out.println(String.format("%.0f", ans));
    }
}
