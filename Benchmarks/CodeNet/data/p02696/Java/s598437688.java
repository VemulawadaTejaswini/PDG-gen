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

        long left = 1;
        long right = N;
        long max = Long.MIN_VALUE;
        //while (left <= right) {
        //    long x = left;
        //    long cand = func(x);
        //    max = Math.max(max, cand);
        //    left++;
        //}
        
        while (left + 1 < right) {
            long lcand = func(left);
            long rcand = func(right);

            max = Math.max(max, lcand);
            max = Math.max(max, rcand);

            long mid = (left + right) / 2;
            if (lcand <= rcand) {
                left = mid;
            } else {
                right = mid;
            }
        }

        System.out.println(max);
    }

}