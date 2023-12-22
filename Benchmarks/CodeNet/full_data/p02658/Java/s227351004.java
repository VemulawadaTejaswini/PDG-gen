import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long ans = 1;

        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if(a[i] == 0){
                System.out.println(0);
                return;
            }
        }

        for(int i = 0; i < n; i++){
            ans *= a[i];
            if(ans < 0 || 1000000000000000000L < ans){
                System.out.println(-1);
                return;
            }
        }

        System.out.println(ans);

    }
}
