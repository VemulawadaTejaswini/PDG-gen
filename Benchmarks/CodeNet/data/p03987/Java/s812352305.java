
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] all = new int[n];
        int[] indexOfAll = new int[n];
        for (int i = 0; i < n; i++) {
            all[i] = scanner.nextInt();
            indexOfAll[all[i] - 1] = i;
        }
        BigDecimal r = new BigDecimal((n - indexOfAll[0]) * (indexOfAll[0] + 1));
        for (int i = 2; i <= n; i++) {
            int myIndex = indexOfAll[i - 1];
            int rightSmallIndex = n;
            int leftSmallIndex = -1;
            for (int j = 1; j < i; j++) {
                int otherIndex = indexOfAll[j - 1];
                if (otherIndex < myIndex) {
                    leftSmallIndex = Math.max(leftSmallIndex, otherIndex);
                } else {
                    rightSmallIndex = Math.min(rightSmallIndex, otherIndex);
                }
            }

            BigDecimal current = new BigDecimal(i);
            int val = myIndex - leftSmallIndex;
            int val1 = rightSmallIndex - myIndex;
//            System.out.println(leftSmallIndex);
//            System.out.println(rightSmallIndex);
//            System.out.println(myIndex);
//            System.out.println(
//                    myIndex + ", " + current + ", from:" + val + " to:"
//                    + val1);
            BigDecimal multiply = current.multiply(new BigDecimal(val))
                                         .multiply(new BigDecimal(val1));
//            System.out.println(multiply);
            r = r.add(multiply);

        }
        System.out.println(r);
    }
}
