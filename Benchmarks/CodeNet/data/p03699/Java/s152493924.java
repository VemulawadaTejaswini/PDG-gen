import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] s = new Integer[n];
        for(int i = 0;i < n;i++) s[i] = sc.nextInt();
        Arrays.sort(s, Collections.reverseOrder());

        long[] sum = new long[n + 1];
        int[] remainder = new int[n + 1];
        sum[0] = 0;
        remainder[0] = 0;
        for(int i = 0;i < n;i++) {
            sum[i + 1] = sum[i] + s[i];
            remainder[i + 1] = (int)(sum[i + 1] % 10);
        }

        long ans = 0;
        for(int i = n;i >= 0;i--) {
            if(remainder[i] != 0) {
                ans = sum[i];
                break;
            }
        }

        System.out.println(ans);
    }

}
