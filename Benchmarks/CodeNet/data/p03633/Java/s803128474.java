import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] t = new long[n];
        for(int i = 0; i<n; i++) {
            t[i] = sc.nextLong();
        }
        if(n==1) {
            System.out.println(t[0]);
            return;
        }
        long min = t[0]/gcd(t[0],t[1])*t[1];
        //System.err.println(gcd(t[0],t[1]));
        for(int i = 2; i<n; i++) {
            min = min/gcd(t[i],min)*t[i];
        }
        System.out.println(min);


    }
    public static long gcd(long a, long b) {
        if(a<b) {
            long tmp = a;
            a = b;
            b = tmp;
        }
        long r = a%b;
        while(r!=0) {
            a = b;
            b = r;
            r = a%b;
        }
        return b;
    }
}
