import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){

            double a = sc.nextLong();
            double b = sc.nextLong();
            double n = sc.nextLong();

            double ans = 0;
            for(double x = 1; x <= n; x++){
                double d = Math.floor(a*x/b) - a*Math.floor(x/b);
                if(ans < d){
                    ans = d;
                }
            }

            System.out.println((long)ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}