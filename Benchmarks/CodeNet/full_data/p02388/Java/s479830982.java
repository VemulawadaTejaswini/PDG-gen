import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
  	Scanner stdn = new Scanner(System.in);
	int x = 0;
	double y = 0d;
  	System.out.print("x=");
  		x = stdn.nextInt();
  	
  	y = Math.pow((double)x,3.0);
  	
    System.out.println((int)y);
  }
}