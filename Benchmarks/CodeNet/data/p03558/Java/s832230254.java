import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long K =sc.nextLong();
        final long nMax = 100000;
        int ans = Integer.MAX_VALUE;
        long i = 1L;
        while(i<=nMax){
            long j=i*K;
            int cur = 0;
            while(j>0){
                cur += j%10;
                j = j/10;
            }
            ans = Math.min(ans,cur);
            i++;
        }
        /*for(int i=1;i<=nMax;i++){
            long j = K*i;
            int cur = 0;
            while(j>0){
                cur += j%10;
                j = j/10;
            }
            ans = Math.min(ans,cur);
        }*/


        System.out.println(ans);
    }
}