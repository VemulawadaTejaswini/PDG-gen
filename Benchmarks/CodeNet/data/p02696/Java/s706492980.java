import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long A = in.nextLong(), B = in.nextLong(), N = in.nextLong();
        long res = N >= B ? A - 1 : (long)((double)N / B * A);
        System.out.println(res);
    }
}