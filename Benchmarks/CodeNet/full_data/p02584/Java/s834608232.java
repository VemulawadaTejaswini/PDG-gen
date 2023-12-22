import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();
        int kd = 1;
        long tk = k;
        while(0 < tk / 10){
            kd++; tk /= 10;
        }
        int dd = 1;
        long td = d;
        while(0 < td / 10){
            dd++; td /= 10;
        }
        long ans = x;
        if(15 < kd + dd || x < k * d){
            long sho = x / d;
            long rk = k - sho;
            boolean odd = rk % 2 == 1;
            if(odd){
                ans = Math.abs(x % d - d);
            }else{
                ans = x % d;
            }
        }else{
            ans = x - k*d;
        }
        System.out.println(ans);
        sc.close();

    }

}
