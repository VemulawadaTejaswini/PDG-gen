import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] A = new long[n];

        long sumLength = 0;

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
            sumLength += A[i];
        }

        long min_diff = Integer.MAX_VALUE;

        long sumLength0 = 0;

        for (int i = 0; i < n; i++) {
            sumLength0 += A[i];
            long diff = Math.abs((sumLength - sumLength0) - sumLength0);
            if (diff < min_diff) {
                min_diff = diff;
            }
        }
        System.out.println(min_diff);
    }
}