import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            double a = Integer.parseInt(sc.next());
            double b = Integer.parseInt(sc.next());
            double hour = Integer.parseInt(sc.next());
            double minute = Integer.parseInt(sc.next());

            double angle = Math.abs((hour + minute/60)*30 - minute*6);
            if(angle > 180) angle = 360 - angle;

            double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(angle)));

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}