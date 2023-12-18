import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (x > 0) {
                x -= a[i];
                t++;
            } else break;
        }
        if (x != 0)
            t--;
            System.out.println(t);
    }
}

