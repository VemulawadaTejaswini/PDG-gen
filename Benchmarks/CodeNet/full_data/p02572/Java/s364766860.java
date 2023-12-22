import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        long sum = 0;
        long tempSum = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = s.nextLong();
        }

        for (int i = 0; i < A.length; i++) {
            tempSum = 0;
            for (int j = i + 1; j < A.length; j++) {
                tempSum += A[j];
            }
            tempSum = tempSum%1000000007;
            sum += (tempSum * A[i])%1000000007;
        }

        System.out.println(sum);
    }
}