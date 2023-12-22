import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            double a = sc.nextLong();
            double b = sc.nextLong();
            double n = sc.nextLong();

            double ans = 0;

            if(n == 1){
                ans = Math.floor(a*1/b) - a*Math.floor(1/b);
            }else if(b > n){
                ans = Math.floor(a*n/b) - a*Math.floor(n/b);
            }else{
                ans = Math.floor(a*(n-1)/b) - a*Math.floor((n-1)/b);
            }

            System.out.println((long)ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}
