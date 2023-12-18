import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();

        long ans = 0;
        if (k < a) {
            ans = k;
        } else if (k < a + b) {
            ans = a;
        } else if (k < a + b + c) {
            ans = 2*a + b - k;
        } else {
            ans = a - c;
        }
        System.out.println(ans);
    }
}

