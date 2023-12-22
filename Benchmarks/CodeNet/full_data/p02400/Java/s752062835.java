import java.util.Scanner;

class Main{
   	Scanner scan = new Scanner(System.in);
    	double r = scan.nextDouble();
    	double pi = 3.141592653589;
    	
    	System.out.println(String.format("%8f", r*r*pi) + " " + String.format("%8f", 2*r*pi));
    	
     }
}