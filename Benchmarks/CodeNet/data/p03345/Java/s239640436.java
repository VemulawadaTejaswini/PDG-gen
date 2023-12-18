import java.util.*;
class Main{
    public static void main(String[] args){
        
        long limit  = (long)(Math.pow(10 , 18)) ;
        Scanner s = new Scanner(System.in) ;
        long a = s.nextLong() , b = s.nextLong() , c = s.nextLong()  , k = s.nextLong() ;
        long ans = 0;
        if(k > 0){
        ans = b - a;
        long val = (long)(Math.abs(ans)) ;
//         System.out.println(val*k) ;
        if(val * k >= limit || val * k <= 0)
            System.out.println("Unfair");
        else
            System.out.println(ans*k);
        }
        else{
            ans = a - b;
            System.out.println(ans) ;
        }
    }
}