import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[n - k + 1];
        for(int i = 0; i < n - k + 1; i++){
            if (a[i] >= 0) {
                b[i] = a[i + k - 1];
            }else if (a[i + k - 1] < 0) {
                b[i] = -1 * a[i];
            }else if (-1 * a[i] > a[i + k - 1]) {
                b[i] = 2 * a[i + k - 1] - a[i];
            }else{
                b[i] = -2 * a[i] + a[i + k - 1];
            }
        }
        int min = 200000000;
        for(int i = 0; i < b.length; i++){
            min = Math.min(min, b[i]);
        }
        System.out.println(min);
    }
}