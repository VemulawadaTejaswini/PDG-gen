import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (Math.abs(a - b) % 2 == 0) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            long cand1 = Math.max(b - 1, a - 1);
            long cand2 = Math.max(n - b, n - a);
            System.out.println(Math.min(cand1, cand2));
        }
    }
}