import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		double a=(double)sc.nextLong();
		double b=sc.nextDouble();
		
		double ans=Math.floor(a*b);
		System.out.println((long)ans);
	}

}
