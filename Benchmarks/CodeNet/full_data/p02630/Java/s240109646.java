import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            counter.put(arr[i], counter.getOrDefault(arr[i], 0) + 1);
            sum += arr[i];
        }
        int q = sc.nextInt();
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (counter.containsKey(x)) {
                int counts = counter.get(x);
                sum += counts * (y - x);
                counter.remove(x);
                counter.put(y, counter.getOrDefault(y, 0) + counts);
            }
            ans[i] = sum;
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}