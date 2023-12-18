import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int ans = 1000000000;

        for (int i = 0; i < n - k; i++) {
            int min = array[i];
            int max = array[i + k];
            if (min > 0) {
                min = 0;
            }

            if (max < 0) {
                max = 0;
            }

            if (ans > max - min) {
                ans = max - min;
            }
            
        }

        System.out.println(ans);

    }
}