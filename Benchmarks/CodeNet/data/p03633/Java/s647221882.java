import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        long[] t = new long[n];
        for(int i = 0; i < n; i++){
            t[i] = sc.nextLong();
        }
        long ans = lcm(t[0], t[1]);

        for(int i = 2; i < n; i++){
            ans = lcm(ans,t[i]);
        }
        System.out.println(ans);
    }

    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
}