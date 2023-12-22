import java.util.*;

class Main {

    static private int A;
    static private long B;
    static private long N;

    private static long func(long x) {
        return (A * x / B) - (A * (x / B));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextLong();
        N = sc.nextLong();

        long x = N;
        if (N >= B-1) x = B - 1;

        System.out.println(func(x));
    }

}