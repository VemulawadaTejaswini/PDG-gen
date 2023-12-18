import java.util.Scanner;

class Problem {
    private long A;
    private long B;

    Problem() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
    }

    long solve() {
        long a = A;
        long b = B;

        long ans = ((B - A) % 2) % 2 == 0 ? 0: 1;
        for (int i = 1; i < 62; i++) {
            long nones = 0;
            long selector = ((long) 0x01) << i;
            long upper = ((long) 0x01) << (i+1);

            boolean skip = false;
            if ((A & selector) > 0) {
                long d = Math.min(upper - 1, B);
                if (d == B) {
                    skip = true;
                }
                nones = (d % upper) - (A % upper) + 1;
            }
            if (!skip && (B & selector) > 0) {
                nones += (B % upper) + 1;
            }
            if (nones % 2 == 1) {
                ans += selector;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Problem().solve());
    }
}
