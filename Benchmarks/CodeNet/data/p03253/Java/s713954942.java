import java.util.*;

public class Main {
    static final long DIV = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if(n == 1 || m == 1){
            System.out.println(1);
            return;
        }

        int div = 2;
        int count = 0;
        ArrayList<Integer> num = new ArrayList<Integer>();
        while(div <= Math.sqrt(m) + 10){
            if(m % div == 0){
                count++;
                m /= div;
            }else{
                if(count > 0){
                    num.add(count);
                    count = 0;
                }else{
                    div++;
                }
            }
        }
        if(count > 0) num.add(count);
        if(m != 1) num.add(1);

        long[] fact = new long[2*n+10];
        long[] ifact = new long[2*n+10];
        fact[0] = 1;
        fact[1] = 1;
        ifact[0] = 1;
        ifact[1] = 1;
        for(int i=2; i<n+10; i++){
            fact[i] = (fact[i-1]*i) % DIV;
            ifact[i] = inverseElement(fact[i], DIV);
        }

        long ans = 1;
        for(int i=0; i<num.size(); i++){
            ans *= fact[n+num.get(i)-1];
            ans %= DIV;
            ans *= ifact[num.get(i)];
            ans %= DIV;
            ans *= ifact[n-1];
            ans %= DIV;
        }

        System.out.println(ans);
    }

    public static long inverseElement(long a, long n){
        long b = n, u=1, v=0;
        while(b > 0) {
            long t = a/b;
            a -= t*b;
            u -= t*v;
            //swap
            t = a;
            a = b;
            b = t;
            t = u;
            u = v;
            v = t;
        }
        u = u % n;
        if(u < 0) u += n;
        return u;
    }
}