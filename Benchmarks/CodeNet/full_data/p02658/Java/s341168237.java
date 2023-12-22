import java.util.*;

public class Main {

    static long MAX = 1_000_000_000_000_000_000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        boolean hasZero = false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if(a[i] == 0) hasZero = true;
        }
        if(hasZero){
            System.out.println(0);
        }else{
            long ans = a[0];
            boolean over = false;
            for (int i = 1; i < n; i++) {
                int d1 = String.valueOf(ans).length();
                int d2 = String.valueOf(a[i]).length();
                if(19 < d1 + d2){
                    over = true;break;
                }
                ans *= a[i];
                if(MAX < ans){
                    over = true;break;
                }
            }
            if(over) System.out.println(-1);
            else System.out.println(ans);
        }
        sc.close();

    }

}
