import java.util.Scanner;
import java.lang.Math;

public class Main{
  public static void main(String[] args){
  	Scanner stdn = new Scanner(System.in);
	int x = 0;
  	double y = 0.0;

	  	System.out.print("x=");
  			x = stdn.nextInt();
	  	if(x > 0 && x < 101){
	  		y = Math.pow((double)x,3d);
	  		x = (int)y;
	  	}
	    System.out.println("x=" + x);
  }
}