import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - b[i]);
        }
        System.out.println(ans);
    }
}
