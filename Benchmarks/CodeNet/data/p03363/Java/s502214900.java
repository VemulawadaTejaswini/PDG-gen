import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            arr[i] += arr[i - 1];
        }
        Arrays.sort(arr);
        long count = 1;
        long total = 0;
        long prev = arr[0];
        for (int i = 1; i <= n; i++) {
            if (prev == arr[i]) {
                count++;
            } else {
                prev = arr[i];
                total += count * (count - 1) / 2;
                count = 1;
            }
        }
        total += count * (count - 1) / 2;
       System.out.println(total);
    }
}
