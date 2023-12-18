
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long [] a = new long[n + 1];
        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextLong();
        }
        long [] sum = new long[n];
        long [] minus = new long[n];
        for (int i = 1; i <= n; ++i) {
            sum[i - 1] = a[i] + i;
            minus[i - 1] = a[i] - i;
        }
        Arrays.sort(sum);
        Arrays.sort(minus);
//        System.out.println("=============sum: ");
//        for (int i = 0; i < n; ++i) {
//            System.out.print(sum[i] + " ");
//
//        }
    //    System.out.println("==============minus: ");
//        for (int i = 0; i < n; ++i) {
//            System.out.print(minus[i] + " ");
//        }
        long ans = 0;
        for (int i = 1; i <= n; ++i) {
            long findSum = i - a[i];
            long findMinus = -a[i] - i;
            long currentSum = a[i] + i;
            long currentMinus = a[i] - i;
//            System.out.println("-----------");
//            System.out.println("i: " + i);
//            System.out.println("findSum: " + findSum);
//            System.out.println("findMinus: " + findMinus);
//            System.out.println("currentSum: " + currentSum);
//            System.out.println("currentMinus: " + currentMinus);

            int sumLeft = lowerBound(sum, -1, sum.length, findSum);
            int sumRight = lowerBound(sum, -1, sum.length, findSum + 1);
            int minusLeft = lowerBound(minus, -1, minus.length, findMinus);
            int minusRight = lowerBound(minus, -1, minus.length, findMinus + 1);

//            System.out.println("sumLeft: " + sumLeft + " sumRight: " + sumRight);
//            System.out.println("minusLeft: " + minusLeft + " minusRight: " + minusRight);
            ans += sumRight - sumLeft;
            ans += minusRight - minusLeft;
            if (currentSum == findSum) {
                --ans;
            }
            if (currentMinus == findMinus) {
                --ans;
            }
         //   System.out.println("ans: " + ans);
        }
        ans /= 2;
        System.out.println(ans);
    }

    public static int lowerBound(long [] arr, int l, int r, long key) {
   //     System.out.println("key: " + key);
        while (r - l > 1) {
            int mid = (l + r) / 2;
        //    System.out.println("mid: " + mid +  " arr[mid]: " + arr[mid]);
            if (arr[mid] >= key) {
                r = mid;
            } else {
                l = mid;
            }
       //     System.out.println("l: " + l + " r: " + r);
        }
        return r;
    }
}
