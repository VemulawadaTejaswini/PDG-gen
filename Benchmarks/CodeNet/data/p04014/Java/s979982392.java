import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();
        long ans = solve(n,s);
        System.out.println(ans);
    }
    static long helper(long n, long base){
        long ans = 0;
        while(n>0){
            ans += n%base;
            n=n/base;
        }
        return ans;
    }
    static long solve(long n, long s){
        if(n<s) return -1;
        if(n==s) return n+1;
        long dif = n-s;
        long upper = (long) Math.floor(Math.sqrt(dif))+1;
        long ans = Long.MAX_VALUE;
        for(long b=2;b<=upper;b++){
            if(dif%(b-1)==0){
                long k=dif/(b-1);
                long cur1 = helper(n,b);
                if(cur1==s) ans = Math.min(ans,b);
                long cur2 = helper(n,k+1);
                if(cur2==s) ans = Math.min(ans,k+1);
            }
        }
        if(ans==Long.MAX_VALUE) return -1;
        else return ans;
    }
}
