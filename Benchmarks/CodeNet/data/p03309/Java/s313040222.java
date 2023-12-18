import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(sc.nextInt() - (i + 1));
            sum += arr[i];
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int median = (int) Math.ceil(arr[n / 2]);
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.abs(arr[i] - median);
        }
        System.out.println(sum);
    }
}
