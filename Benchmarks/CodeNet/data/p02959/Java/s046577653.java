import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        long[] b = new long[n];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long ans1 = 0l;
        for (int i = 0; i < n; i++) {
            long x = b[i];
            if(x <= a[i]){
                ans1 += x;
            }else{
                ans1 += a[i];
                x -= a[i];
                if(x <= a[i+1]){
                    ans1 += x;
                    a[i+1] -= x;
                }else{
                    ans1 += a[i+1];
                }
            }
        }
        long ans2 = 0l;
        for (int i = n; i >= 1; i--) {
            long x = b[i-1];
            if(x <= a[i]){
                ans2 += x;
            }else{
                ans2 += a[i];
                x -= a[i];
                if(x <= a[i-1]){
                    ans2 += x;
                    a[i-1] -= x;
                }else{
                    ans2 += a[i-1];
                }
            }
        }

        System.out.println(Math.max(ans1, ans2));
        sc.close();

    }

}
