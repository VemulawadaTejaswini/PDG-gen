import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        int d = (int)(a / b);
        int r = (int)(a % b);
        double f = a / b;
        
        System.out.println(d + " " + r + " " + String.format("%.5f",f));
    }
}
