import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a =scn.nextLong();
		double b =scn.nextDouble();
		 long c =(long)(b*100);
		long val = a*c;
		System.out.println(val/100);

	}

}