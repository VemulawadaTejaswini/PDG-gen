import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if ((b - a) % 2 == 0) {
            System.out.println((b - a) / 2);
        } else {
            long cand1 = Math.min(b - 1, n - a);
            // Aがはじ
            long cand2 = (a - 1) + (b - a + 1) / 2;
            // Bがはじ
            long cand3 = (n - b) + (b - a + 1) / 2;
            System.out.println(Math.min(Math.min(cand1, cand2), cand3));
        }
    }
}