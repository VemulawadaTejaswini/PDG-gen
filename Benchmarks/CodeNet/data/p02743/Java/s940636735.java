import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(a+b+2*Math.sqrt(a*b)<c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
