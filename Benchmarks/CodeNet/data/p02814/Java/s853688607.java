import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = sc.nextInt()/2;

        long lcm = arr[0];

        int cnt = 0;
        int tmp = 0;

        while (arr[0]%2==0){
            cnt++;
            arr[0] /= 2;
        }

        for (int i=1; i<n; i++){
            tmp = 0;
            while (arr[i]%2==0){
                tmp++;
                arr[i] /= 2;
            }
            if (cnt!=tmp){
                System.out.println(0);
                return;
            }
        }
        for (int i=1; i<n; i++){
            lcm = lcm(lcm, arr[i]);
        }



//        if (lcm>m) {
//            System.out.println(0);
//            return;
//        }else {
            System.out.println((m/lcm+1)/2);
//        }



    }

    public static long lcm(long m, long n){
        return m*n/gcd(m ,n);
    }
    public static long gcd(long m, long n){
        if (m<n) gcd(n,m);
        if (n==0) return m;
        return gcd(n, m%n);
    }
}