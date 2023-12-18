import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextInt();
        long count = 0;
        if (a == 0 && b == 0) {
            count++;
        } else if (a == 0) {
            count = (b / x) + (a / x);
            count++;
        } else {
            count = (b / x) - ((a - 1) / x);
        }
        System.out.println(count);
    }
}
