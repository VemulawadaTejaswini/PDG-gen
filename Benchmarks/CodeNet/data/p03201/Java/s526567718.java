import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            int max = 0;
            if (a[i] == 0) {
                continue;
            }
            for (int j = 0; j < 33; j++) {
                if (Math.pow(2, j) > a[i]) {
                    max = (int)Math.pow(2, j);
                    break;
                }
            }
            for (int j = 0; j < i; j++) {
                if (a[j] == max - a[i]) {
                    a[i] = 0;
                    a[j] = 0;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}