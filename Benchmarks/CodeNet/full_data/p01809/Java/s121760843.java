import java.util.*;

public class Main{
        public static void main(String args[]){
                try(Scanner sc = new Scanner(System.in)){
                        long p = sc.nextLong(), q = sc.nextLong();
                        System.out.println(q/gcd(p,q));
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