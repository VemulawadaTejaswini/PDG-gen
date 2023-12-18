import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        for (int i = 1; i <= 100; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += (arr[j] - i) * (arr[j] - i);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}