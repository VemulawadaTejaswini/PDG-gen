import java.util.*;


class Main{
    static long mod = 1000000007;
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        n = n-k;
        int mi = Math.min(k, n+1);
        long prev = n+1;
        System.out.println(prev);
        for(long i=2;i<=mi;i++){
            prev = (prev * (long)(n+2-i));
            prev = (prev * (long)(1+k-i));
            prev = prev/(i*(i-1));
            prev %= mod;
            System.out.println(prev);
        }
    }
}