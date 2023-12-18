import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if((-a-b+c)*(-a-b+c)/4>a*b){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
