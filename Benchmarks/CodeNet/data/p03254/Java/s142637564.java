import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        if (total == x) {
            System.out.println(n);
            return;
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n && x >= 0; i++) {
            count++;
            x -= arr[i];
        }
        System.out.println(count - 1);
    }
}
