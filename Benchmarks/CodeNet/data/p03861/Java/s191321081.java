import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = sc.nextLong();
        long count = 0;
        System.out.println((b / x + 1) - ((a - 1) / x + 1));
    }
}
