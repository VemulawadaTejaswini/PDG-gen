import java.util.*;
import java.lang.*;

import static java.lang.StrictMath.abs;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long q = sc.nextInt();
        long h = sc.nextInt();
        long s = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();
        long t = Math.min(8*q, 4*h);
        long t2 = Math.min(t, 2*s);
        long t3 = Math.min(t2, d);
        long ans = 0;
        if(t3 == 8*q){
            ans = q*4*n;
        }else if(t3 == 4*h){
            ans = h * 2 * n;
        }else if(t3 == s*2){
            ans = s*n;
        }else if(t3 == d){
            ans += d*(n/2);
            if(t2 == 2*s){
                ans += s;
            }else if(t2 == 4*h){
                ans += 2*h;
            }else if(t2 == 8*q){
                ans += 4*q;
            }
        }
        System.out.println(ans);

        


    }
}
