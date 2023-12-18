import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static int firstKMin = 0 ;
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        firstKMin = IntStream.range(0, k - 1)
                .map(i -> arr[i])
                .min().orElse(0);

        System.out.println(solve(arr, arr.length - 1, k));
    }

    public static int solve(int[] arr, int index, int k) {

        //memoization
        if (map.containsKey(index)) {
            return map.get(index);
        }

        //base case
        if (index <= k - 1) {
            return firstKMin;
        }


        //recursive case
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < k; i++) {
            min = Math.min(min, (solve(arr, index - i, k) + Math.abs(arr[index] - arr[index - i])));
        }
        map.putIfAbsent(index, min);
        return min;
    }


}
