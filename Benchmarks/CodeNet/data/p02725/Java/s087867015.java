import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int max = 0;
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        a[n] = a[0];
        
        for (int i = 0; i < n; i++) {
            int dis = Math.abs(a[i+1] - a[i]); 
            max = Math.max(max, dis);
        }
        
        System.out.println(k - max);
    }
}
