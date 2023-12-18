import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        long digits = 0L;
        long sum = 0L;
        for (int i=0;i<M;i++) {
            long d = sc.nextLong();
            long c = sc.nextLong();
            digits += c;
            sum += d*c;
        }
        System.out.println((sum-1)/9+digits-1);
    }
}