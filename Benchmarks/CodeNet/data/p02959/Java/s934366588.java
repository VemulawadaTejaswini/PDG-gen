import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int x = b[i];
            if(x <= a[i]){
                ans += (long) x;
            }else{
                ans += (long) a[i];
                x -= a[i];
                if(x <= a[i+1]){
                    ans += (long) x;
                    a[i+1] -= x;
                }else{
                    ans += (long) a[i+1];
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
