import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int first = 0;
        int second = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            if (first == 0) {
                if (a[n - 1 - i] == a[n - 2 - i]) {
                    first = a[n - 1 - i];
                    i++;
                }
            } else {
                if (second == 0) {
                    if (a[n - 1 - i] == a[n - 2 - i]) {
                        second = a[n - 1 - i];
                    }
                }
            }
        }
        System.out.println((long) first * second);
    }
}