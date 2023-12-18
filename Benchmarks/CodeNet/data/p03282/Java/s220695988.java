import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        long K = sc.nextLong();

        System.out.println(solve(S, K));
    }

    public static int solve(String S, long K){
        long next = 5_000_000_000_000_000L;

        long count = 0;
        for (int i=0; i<S.length(); i++) {
            int t = S.charAt(i) - '0';

            count += Math.pow(t, next);

            if (K <= count) return t;
        }

        return -1;
    }
}