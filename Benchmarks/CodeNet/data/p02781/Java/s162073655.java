import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        long K = sc.nextInt();
        long res=0;
        for(long i=1;i<N.length();i++){
            StringBuilder bld = new StringBuilder();
            for(long k=0;k<i;k++){
                bld.append("9");
            }
            res += calc(bld.toString(), K);
        }
        res += calc(N, K);
        System.out.println(res);
    }

    public static long calc(String N, long K){
        long top = N.charAt(0)-'0';
        long L = N.length();
        if(L == 1){
            if(K==1){
                return top;
            }else{
                return 0;
            }
        }
        long nxt = N.charAt(1) - '0';
        long res = 0;
        if(K == 1){
            res = top + 9 * (L-1);
        }else if(K==2){
            if(L==1){return 0;}
            res = (top-1) * (L-1) * 9 + (L-2)*9+nxt;
        }else if(K==3){
            if(L <= 2){return 0;}
            res += com2(L-1) * 81 * (top-1);
            res += com2(L-2) * 81;
            res += (L - 2) * 9 * (nxt-1);
            res += (L - 3) * 9;
            res += (N.charAt(2) - '0');
        }
        return res;
    }

    public static long com2(long n){
        return n*(n-1)/2;
    }
}