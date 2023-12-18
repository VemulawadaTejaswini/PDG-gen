import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long a = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        sc.close();
        System.out.println((K - s) * (a - d));
    }
}