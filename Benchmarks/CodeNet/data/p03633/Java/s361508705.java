import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long ans = 1;
        for (int i=0;i<N;i++){
         long n = in.nextLong();
         ans = lcm(ans,n);
        }
        System.out.println(ans);
    }
        public static long gcd(long a, long b){
        while(true){
            if(a == 0) return b;
            b %= a;
            if(b == 0) return a;
            a %= b;
        }
    }
    public static long lcm(long a, long b){
        if(gcd(a, b) > 0){
            return a/gcd(a,b)*b;
        }else{
            return 0;
        }
    }
}