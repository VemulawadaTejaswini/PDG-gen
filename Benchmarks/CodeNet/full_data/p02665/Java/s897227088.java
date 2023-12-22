import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n+1];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextLong();
        }
        if(a[0] != 0){
            System.out.println(-1);
        }else{
            long[] max = new long[n+1];
            max[n] = a[n];
            for (int i = n; i > 0; i--) {
                max[i-1] = max[i] + a[i-1];
            }
            max[0] = 1;
            long ans = 1L;
            for (int i = 0; i < n; i++) {
                max[i+1] = Math.min(max[i+1], (max[i] - a[i]) * 2);
                ans += max[i+1];
                if(max[i+1] < a[i+1]){
                    ans = -1;break;
                }
            }
            System.out.println(ans);
        }
        sc.close();

    }

}
