import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Double a,b,angle;
        
        a=scan.nextDouble();
        b=scan.nextDouble();
        angle=scan.nextDouble()*2*Math.PI/360;
        System.out.println(0.5*a*b*Math.sin(angle));
        System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos(angle))+a+b);
        System.out.println(b*Math.sin(angle));
    }
}
