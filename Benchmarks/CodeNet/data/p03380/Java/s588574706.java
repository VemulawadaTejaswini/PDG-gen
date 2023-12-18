

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] a;

    public static void main(String[] args) {
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[a.length - 1] + " " + a[(a.length-1) / 2]);
    }
}
