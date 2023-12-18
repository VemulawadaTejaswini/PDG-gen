import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		double e=(double)((double)a*b)/2;
		if(a==2*c&&b==2*d){
			System.out.printf("%.6f",e);
		 System.out.println(" 1");
		}
		else{
			System.out.printf("%.6f",e);
	      System.out.println(" 0");
	}
	}
}