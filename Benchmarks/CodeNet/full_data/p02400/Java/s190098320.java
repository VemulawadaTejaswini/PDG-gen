
import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	
    	double a=sc.nextDouble();
    	double b=2;
    	System.out.println(String.format("%.6f", a*a*Math.PI)+" "+String.format("%.6f", b*Math.PI*a));
    }
}

