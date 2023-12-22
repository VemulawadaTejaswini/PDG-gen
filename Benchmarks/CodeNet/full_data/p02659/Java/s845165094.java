import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		double a =scn.nextDouble();
		double b =scn.nextDouble();
		double ans = a*b;
		long val = (long)Math.floor(ans);
		System.out.println(val);

	}

}