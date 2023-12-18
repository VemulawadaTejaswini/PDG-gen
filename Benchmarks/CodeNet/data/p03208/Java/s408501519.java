

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        long result = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if ((i + k - 1) < n && result > Math.abs(a[i] - a[i + k - 1])) {
                result = Math.abs(a[i] - a[i + k - 1]);
            }
        }
        System.out.println(result);

    }

}
