import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static long[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new long[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLong() - (i+1);
        }

        Arrays.sort(arr);

        long right = 1000000000;
        long left = -1000000000;
        while(Math.abs(left - right) > 2) {
            //System.err.println(left+" "+right);
            long midLeft = left + (right - left)/3;
            long midRight = left + (right - left)*2/3;
            long midLeftResult = calc(midLeft);
            long midRightResult = calc(midRight);
            if(midLeftResult > midRightResult) {
                left = midLeft;
            } else {
                right = midRight;
            }
        }
       // System.err.println(left+" "+right);
        long[] results = new long[3];
        results[0] = calc(left);
        results[1] = calc(left+1);
        results[2] = calc(left+2);
        Arrays.sort(results);
        System.out.println(results[0]);
    }

    static long calc(long b) {
        long result = 0;
        for(long num : arr) {
            result += Math.abs(num - b);
        }
        return result;
    }
}
