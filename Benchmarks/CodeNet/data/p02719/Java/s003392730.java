import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long remainder = N % K;

        if (remainder == 0) {
            System.out.println(0);
        } else {
            if (remainder > (K - remainder)) {
                System.out.println(K - remainder);
            } else {
                System.out.println(remainder);
            }
        }
    }
}