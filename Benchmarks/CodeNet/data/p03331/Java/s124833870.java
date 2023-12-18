import java.util.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        int A, B;
        int N;
        int[] sum;
        int minVal;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sum = new int[N - 1];
        for (A = 1; A <= N - 1; A++) {
            B = N - A;
            sum[A - 1] = sumOfEachDigit(A) + sumOfEachDigit(B);
        }
        minVal = sum[0];
        for (A = 1; A <= N - 1; A++) {
            if (minVal < sum[A - 1]) minVal = sum[A - 1];
        }
        System.out.println(minVal);
    }
    public static int sumOfEachDigit (int n){
        if (n / 10000 != 0) {
            int n5, n4, n3, n2, n1;
            n5 = n / 10000;
            n4 = (n - n5 * 10000) / 1000;
            n3 = (n - n5 * 10000 - n4 * 1000) / 100;
            n2 = (n - n5 * 10000 - n4 * 1000 - n3 * 100) / 10;
            n1 = n - n5 * 10000 - n4 * 1000 - n3 * 100 - n2 * 10;
            return n5 + n4 + n3 + n2 + n1;
        } else if (n / 1000 != 0) {
            int n4, n3, n2, n1;
            n4 = n / 1000;
            n3 = (n - n4 * 1000) / 100;
            n2 = (n - n4 * 1000 - n3 * 100) / 10;
            n1 = n - n4 * 1000 - n3 * 100 - n2 * 10;
            return n4 + n3 + n2 + n1;
        } else if (n / 100 != 0) {
            int n3, n2, n1;
            n3 = n / 100;
            n2 = (n - n3 * 100) / 10;
            n1 = n - n3 * 100 - n2 * 10;
            return n3 + n2 + n1;
        } else if (n / 10 != 0) {
            int n2, n1;
            n2 = n / 10;
            n1 = n - n2 * 10;
            return n2 + n1;
        } else {
            return n;
        }
    }
}
