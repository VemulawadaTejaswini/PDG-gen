import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
            if (sum * 2 >= arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println(count + 1);
    }
}
