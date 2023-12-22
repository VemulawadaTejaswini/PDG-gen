import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        BigInteger sum = BigInteger.ZERO;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            counter.put(arr[i], counter.getOrDefault(arr[i], 0) + 1);
            sum = sum.add(BigInteger.valueOf(arr[i]));
        }
        int q = sc.nextInt();
        BigInteger[] ans = new BigInteger[q];
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (counter.containsKey(x)) {
                int counts = counter.get(x);
                // sum += counts * (y - x);
                sum = sum.add(BigInteger.valueOf(counts).multiply(BigInteger.valueOf(y-x)));
                counter.remove(x);
                counter.put(y, counter.getOrDefault(y, 0) + counts);
            }
            ans[i] = sum;
        }
        for (BigInteger i : ans) {
            System.out.println(i);
        }
    }
}