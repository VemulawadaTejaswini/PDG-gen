import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long upper = (long) Math.floor(Math.sqrt(N))+1L;
        long ans = helper(N);
        for(long i=upper;i>0;i--){
            if(N%i==0){
                ans = Math.max(helper(N/i),helper(i));
                break;
            }
        }
        System.out.println(ans);
    }
    static long helper(long n){
        if(n==0) return 0;
        long cnt = 0;
        while(n>0){
            cnt++;
            n = n/10;
        }
        return cnt;
    }
}
