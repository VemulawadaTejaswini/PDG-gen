import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), N = in.nextInt();
        int res = N >= B ? A - 1 : (int)((double)N / B * A);
        System.out.println(res);
    }
}