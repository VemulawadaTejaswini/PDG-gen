

import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            a[i] = value;
            sum += value;
        }
        int avg = (int) Math.round((double) sum / n);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.pow(a[i] - avg, 2);
        }
        System.out.println(ans);
    }

}
