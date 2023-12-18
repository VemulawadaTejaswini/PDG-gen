import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        double ave = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ave += a[i];
        }
        ave /= n;
        double b[] = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = Math.abs(a[i] - ave);
        }
        double min = b[0];
        int mini = 0;
        for (int i = 1; i < n; i++) {
            if (min > b[i]) {
                min = b[i];
                mini = i;
            }
        }
        System.out.println(mini);
    }

}