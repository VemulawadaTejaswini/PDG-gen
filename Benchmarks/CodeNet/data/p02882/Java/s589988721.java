import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double x = sc.nextInt();
        double max = a*a*b;
        if(max/2 >= x){
            System.out.println(90d - Math.toDegrees(Math.atan((2*x/(a*b))/b)));
        }else{
            x = max-x;
            System.out.println(Math.toDegrees(Math.atan((2*x/(a*a))/a)));
        }
        
    }
}