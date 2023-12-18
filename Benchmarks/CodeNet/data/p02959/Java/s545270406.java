import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            if (a[i] < b[i]) {
                b[i] -= a[i];
                a[i] = 0;
                
                if (a[i+1] < b[i]) {
                    a[i+1] = 0;
                } else {
                    a[i+1] -= b[i];
                }
            } else {
                a[i] -= b[i];
            }
        }
        
        long now = 0;
        for (int i = 0; i <= n; i++) {
            now += a[i];
        }
        
        System.out.println(sum - now);
    }
}
