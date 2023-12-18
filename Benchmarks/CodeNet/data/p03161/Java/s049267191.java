import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        /*//note the value of k
        if (k > arr.length) {
            k = arr.length;
        }*/

        System.out.println(solve(arr, arr.length - 1, k));
    }

    public static int solve(int[] arr, int index, int k) {

        //note
        if (k > index) {
            k = index;
        }
        //memoization
        if (map.containsKey(index)) {
            return map.get(index);
        }
        //base case
        if (index == 0) {
            return 0;
        }

        //recursive case
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= k; i++) {
            min = Math.min(min, (solve(arr, index - i, k) + Math.abs(arr[index] - arr[index - i])));
        }
        map.putIfAbsent(index, min);
        return min;
    }


}
