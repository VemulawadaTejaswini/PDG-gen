import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double n=sc.nextDouble();
		
		
		double x=Math.min(b-1,n);
		
		
		System.out.println((long)(Math.floor((a*x)/b)-a*Math.floor(x/b)));
		
		

		
	}
	
}
