import java.util.*;
import java.lang.*; 
 
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextInt();
		double b = scan.nextInt();
		double c = scan.nextInt();
		
		double uhen= Math.pow(c-a-b, 2);
		double sahen = 4*a*b;
		
		if(c-a-b<=0){
		 System.out.println("No");
		}
		else{
		if(sahen < uhen){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		}
	}
}