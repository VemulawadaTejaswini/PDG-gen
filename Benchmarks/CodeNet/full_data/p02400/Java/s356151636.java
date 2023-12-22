import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		double s=0.0, l=0.0;
		
		s = r*r*3.14;
		l = 2 * 3.14 * r;
		
		System.out.println(String.format("%5f", s)+" "+String.format("%5f", l));	
	}
}