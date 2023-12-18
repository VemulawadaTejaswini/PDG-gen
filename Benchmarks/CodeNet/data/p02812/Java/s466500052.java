import java.util.*;

class Main{
    //
    static final long DIV = 100000007L;
    static final int MAX = 2000000000;
    //static long[] fac = new long[MAX];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.replaceAll("ABC", "1");
        char[] ary = s.toCharArray();
        int ans = 0;
        for(int i = 0;i < ary.length;i++){
            if(ary[i]=='1')ans++;
        }
        System.out.println(ans);
    }

    static long modpow(long n){
        long ans =1;
        long a = 2;
        long m = n;
        while(m>0){
            if((m&1)==1)ans = ans*a % DIV;
            a = a * a % DIV;
            m >>= 1;
        }
        return ans;
    }

    static long modcomb(long n,long r){
        return 1;
    }
    
}