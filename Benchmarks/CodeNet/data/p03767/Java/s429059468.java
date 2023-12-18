import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int memberCount = n * 3;
        Integer[] strengthArr = new Integer[memberCount];

        for (int i = 0; i < memberCount; i++) {
            strengthArr[i] = sc.nextInt();
        }

        Arrays.sort(strengthArr, Comparator.reverseOrder());

        long sum = 0;
        int count = 0;
        for (int i = strengthArr.length - 1 - n;; i--) {
            sum += strengthArr[i];
            count++;

            if (count == n) break;
        }

        System.out.println(sum);
    }
}
