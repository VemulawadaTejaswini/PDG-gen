
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
        //a[a.length-1]/2に一番近いもの
        if (n == 2) {
            index = 0;
        } else {
            search(a[a.length - 1] / 2, 0, a.length - 2);
        }

        System.out.println(a[a.length - 1] + " " + a[index]);
    }

    static int diff = Integer.MAX_VALUE;
    static int num = Integer.MIN_VALUE;
    static int index = Integer.MIN_VALUE;

    private static void search(int target, int min, int max) {
        if (max - min <= 1) {
            if (Math.abs(target - a[max]) <= diff && num < a[max]) {
                diff = Math.abs(target - a[max]);
                num = Math.max(num, a[max]);
                index = max;
            }
            if (Math.abs(target - a[min]) <= diff && num < a[min]) {
                diff = Math.abs(target - a[min]);
                num = Math.max(num, a[min]);
                index = min;
            }
            return;
        }
        int mid = (max - min) / 2;
        if (Math.abs(a[mid] - target) > diff) {
            return;
        }
        if (Math.abs(a[mid] - target) <= Math.abs(a[mid + 1] - target)) {
            search(target, min, mid);
        }
        if (Math.abs(a[mid] - target) >= Math.abs(a[mid + 1] - target)) {
            search(target, mid + 1, max);
        }
    }
}
