import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        double a = stdIn.nextInt();
        double b = stdIn.nextInt();
        double x = stdIn.nextInt();
        
        double amari = b - x / (a * a);
        double radian = Math.atan(amari / a);
        double degree = radian * 180 / Math.PI;
        
        //System.out.println(amari);
        //System.out.println(a);
        //System.out.println(radian);
        System.out.println(degree);
    }
}
