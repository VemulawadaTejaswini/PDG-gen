import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            arr[sc.nextInt()] = i;
        }
        arr[0] = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i] < arr[i - 1]) {
                max = Math.max(count, max);
                count = 1;
            } else {
                count++;
            }
        }
        max = Math.max(count, max);
        System.out.println(n - max);
    }
}
