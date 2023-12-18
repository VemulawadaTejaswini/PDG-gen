import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        long ans = 0;
        if (N > 1 && M > 1) {
            ans = (N - 2) * (M - 2);
        }

        if (N > 1 && M < 2) {
            ans = (N - 2);
        }

        if (N < 2 && M > 1) {
            ans = (M - 2);
        }

        if (N < 2 && M < 2) {
            ans = 0;
        }

        System.out.println(ans);
    }
}