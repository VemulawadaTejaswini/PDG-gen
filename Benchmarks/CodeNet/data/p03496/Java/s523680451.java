import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            min = Math.min(min, a[i]);
            if (min == a[i]) {
                minIndex = i;
            }
            max = Math.max(max, a[i]);
            if (max == a[i]) {
                maxIndex = i;
            }
        }
        System.out.println(2 * n - 2);
        if (Math.abs(max) >= Math.abs(min) || min >= 0) {
            for (int i = 0; i < n; i++) {
                if (i != maxIndex) {
                    System.out.println((maxIndex + 1) + " " + (i + 1));
                }
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i != minIndex) {
                    System.out.println((minIndex + 1) + " " + (i + 1));
                }
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.println((n - i) + " " + (n - i - 1));
            }
        }
    }
}
