import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	double x1 = sc.nextDouble(), y1 = sc.nextDouble(),
    		   x2 = sc.nextDouble(), y2 = sc.nextDouble();
    	
    	double a = x2 - x1;
    	double b = y2 - y1;
    	
    	double c = a * a + b * b;
    	c = Math.sqrt(c);
    	
    	System.out.println(c);
    }
}