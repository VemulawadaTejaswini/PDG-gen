import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = calc_n1(n-1);
        ans += calc_n0(n);
        System.out.println(ans);
    }
    
    public static long calc_n1(long l){
        long max = (long)Math.pow(l,0.5)+1;
        long ret = 1;
        for(int i = 2; i < max; i++){
            if(l % i == 0){
                ret += l / i == i ? 1 : 2;
            }
        }
        return ret;
    }
    
    public static long calc_n0(long l){
        long max = (long)Math.pow(l,0.5)+1;
        long ret = 1;
        for(int i = 2; i < max; i++){
            long l2 = l;
            boolean div = false;
            while(l2 % i == 0){
                l2 /= i;
                div = true;
            }
            if(l2 % i == 1 && div){
                ret++;
            }
        }
        return ret;
    }
}