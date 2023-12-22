import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by ctare on 2017/05/16.
 */
public class A2016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Comparator.reverseOrder());

        for (int i = 1; i < a.length; i++) {
            a[i - 1] -= - a[i];
        }
        a[n - 1] = Integer.MAX_VALUE;
        Arrays.sort(a);
        System.out.println(a[n - 1]);
    }
}