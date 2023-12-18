import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

		
		n = n < 2 ? 1 : n - 2;
        m = m < 2 ? 1 : m - 2;

        System.out.print(n * m);
    }
}
