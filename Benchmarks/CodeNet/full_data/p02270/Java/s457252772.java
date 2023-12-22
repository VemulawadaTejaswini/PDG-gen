
import java.util.*;
import java.lang.*;

public class Main {
    
    static int n;
    static int k;
    static int[] truck;
    static int[] w;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        truck = new int[k];
        w     = new int[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            max += w[i];
        }
        min = max / k;
        
        System.out.println(binarySearch(max, min));
        
    }
    
    static boolean check(int mid) {
        int num = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (mid < w[i]) {
                num = k + 1;
                break;
            }
            sum += w[i];
            if (sum > mid) {
                num++;
                sum = w[i];
            }
        }
        if (num <= k) {
            return true;
        } else {
            return false;
        }
    }
    
    static int binarySearch(int max, int min) {
        int right = max;
        int left = min;
        int mid = (left + right) / 2;
        while (right > left + 1) {
            mid = (left + right) / 2;
            //System.out.println("left: " + left + ", right: " + right + ", mid: " + mid);

            if (check(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return (check(left) ? left : right);
    }
}
