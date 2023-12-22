import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int d = a/b;
		int r = a%b;
		double f = (double) a/b ;
		
		System.out.print(d +" ");
		System.out.print(r +" ");
		System.out.print(f +" ");
		scn.close();
	}

}