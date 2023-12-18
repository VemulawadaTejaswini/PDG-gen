import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        for (int i = 1; i < k; i++) {
            if (a >= 1 && b >= 1) a--;
            if (a == 0 && b >= 1) b--;
            if (a == 0 && b == 0) break;
        }
        System.out.print(a + "" + b);
    }
}