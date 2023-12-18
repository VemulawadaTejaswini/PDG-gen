import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = Integer.parseInt(sc.next());
        }

        // greedy at last to 0
        long ans = 0;
        int i = N - 1;
        while (i > 0) {
            int aft = h[i];
            int prv = 10001;
            int tar = 10001;
            if (i > 0) {
                prv = h[i - 1];
            }
            if (i > 1) {
                tar = h[i - 2];
            }
            int b1 = Math.abs(aft - tar);
            int b2 = Math.abs(aft - prv);
            int min = Math.min(b1, b2);
            if (b1 == b2 || min == b2) {
                ans += b2;
                i -= 1;
                System.err.printf("b%s b%s n%s add%s\n", tar, prv, aft, b2);
            } else {
                ans += b1;
                i -= 2;
                System.err.printf("b%s b%s n%s add%s\n", tar, prv, aft, b1);
            }
        }
        System.out.println(ans);
    }
}

