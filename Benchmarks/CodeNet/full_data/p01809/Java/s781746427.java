import java.util.*;

public class Main{
        public static void main(String args[]){
                try(Scanner sc = new Scanner(System.in)){
                        long p = sc.nextLong(), q = sc.nextLong();
                        long memo = q/gcd(p,q);
                        long ans = memo;
                        int i = 0;
                        long[] X = new long[10000];
                        long x = 2;


                        while(memo!=1){
                                while(memo%x==0){
                                        X[i++]=x;
                                        memo/=x;
                                }
                                x++;
                        }
                        if(X[0]==X[i-1]){
                                System.out.println(X[0]);
                        } else {
                                System.out.println(ans);
                        }

                }
        }
        private static long gcd(long p, long q){
                if(p < q) {
                        return gcd(q, p);
                }
                if(q==0){
                        return p;
                }
                return gcd(q, p%q);
        }
}