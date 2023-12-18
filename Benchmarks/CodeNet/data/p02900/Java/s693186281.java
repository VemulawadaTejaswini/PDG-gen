import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
       long A = sc.nextLong();
       long B = sc.nextLong();
       sc.close();

       long g = gcd(A, B);
       long max = g;

       long count = 1;

       for(long i = 2; i*i <= max+1; i++){
           if(g%i == 0){
               while(g%i==0){
                   g /= i;
               }
               count++;
           }
       }
       System.out.println(count);
    }

    static long gcd(long n, long m){
        if(m > n){
            return gcd(m, n);
        } else {
            if(m == 0)
                return n;
            else
                return gcd(m, n%m);
        }
    }
}