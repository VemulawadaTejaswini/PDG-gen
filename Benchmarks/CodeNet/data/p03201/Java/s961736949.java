import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            long req = 0;
            if (a[i - 1] == 0) {
                break;
            }
            for (int j = 0; j < 33; j++) {
                if (Math.pow(2, j) > a[i]) {
                    req = (long)Math.pow(2, j) - a[i];
                    break;
                }
            }
            int min = 2 * count;
            int max = i - 1;
            int c = 0;
            while (max >= min && c < i - 1 - 2 * count) {
                if (a[(min + max) / 2] > req) {
                    max = (min + max) / 2 - 1;
                } else if (a[(min + max) / 2] < req) {
                    min = (min + max) / 2 + 1;
                } else {
                    a[i] = 0;
                    a[(min + max) / 2] = 0;
                    count++;
                    Arrays.sort(a);
                    i++;
                    break;
                }
                c++;
            }
        }
        System.out.println(count);
    }
}