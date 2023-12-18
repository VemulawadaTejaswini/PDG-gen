import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) arr[i] = sc.nextInt()/2;

        long lcm = arr[0];

        int cnt = 0;
        int tmp = 0;


        for (int i=0; i<n; i++){
            if (i==0){
                while (arr[i]%2==0){
                    cnt++;
                    arr[i] /= 2;
                }
            }else {
                while (arr[i]%2==0){
                    tmp++;
                    arr[i] /= 2;
                }
            }
            if (cnt!=tmp){
                System.out.println(0);
                return;
            }
            lcm = lcm(lcm, arr[i]);
            if (lcm>m){
                System.out.println(0);
                return;
            }
        }


        System.out.println((m/lcm+1)/2);



    }

    public static long lcm(long m, long n){
        return m/gcd(m ,n)*n;
    }
    public static long gcd(long m, long n){
        if (m<n) gcd(n,m);
        if (n==0) return m;
        return gcd(n, m%n);
    }
}