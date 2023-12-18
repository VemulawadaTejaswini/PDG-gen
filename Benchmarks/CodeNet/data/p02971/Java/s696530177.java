import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pre_max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Arrays.stream(arr).max().getAsInt();
        boolean max_double = Arrays.stream(arr).filter(i -> i==max).count() > 1;
        if(max_double) {
            for (int i = 0; i < n; i++) {
                System.out.println(max);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == max) continue;
            if(arr[i] > pre_max) {
                pre_max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == max) {
                System.out.println(pre_max);
            } else {
                System.out.println(max);
            }
        }
    }
}