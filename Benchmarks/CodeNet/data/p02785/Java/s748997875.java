import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long attacks = 0;
        if (n > k) {
            Arrays.sort(arr);
            for (int i = n-k-1; i >= 0; i--) {
                attacks += arr[i];
            }
        }

        System.out.println(attacks);
    }
}