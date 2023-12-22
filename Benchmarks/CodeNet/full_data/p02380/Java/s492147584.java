import java.util.Scanner;

class Main{
      public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	double a = scan.nextDouble();
    	double b = scan.nextDouble();
    	double C = scan.nextDouble();
    	
    	double c = Math.sqrt(((a*a) + (b*b))-2*a*b*Math.cos(Math.toRadians(C)));
    	
    	double L = a + b + c;
    	double h = b * Math.sin(Math.toRadians(C));
    	double S = a * h / 2.0;
    	
    	System.out.println(String.format("%.8f", S));
    	System.out.println(String.format("%.8f", L));
    	System.out.println(String.format("%.8f", h));
     }
}