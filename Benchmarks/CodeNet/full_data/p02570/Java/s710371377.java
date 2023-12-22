import java.util.*;
class Main{
  	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    	double D = scan.nextDouble();
      	double T = scan.nextDouble();
      	double S = scan.nextDouble();
      	double reqTime = (D / S);
      	if(reqTime > T) {
        	System.out.println("No");
        }else {
        	System.out.println("Yes");
        }
    }
}