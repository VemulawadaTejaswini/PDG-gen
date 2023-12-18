import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        long remainA = Math.max(A - K, 0);
        long eatA = A - remainA;
        long eatB = Math.min(K - eatA, B);
        long remainB = B - eatB;
        System.out.println(remainA + " " + remainB);
    }
}

