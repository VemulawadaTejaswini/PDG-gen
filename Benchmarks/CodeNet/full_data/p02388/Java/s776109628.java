import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
  	Scanner stdn = new Scanner(System.in);
	double x = 0d;
	double y = 0d;
  	System.out.print("x=");
  		x = stdn.nextDouble();
  	
  	y = Math.pow(x,3.0);
  	
    System.out.println(y);
  }
}