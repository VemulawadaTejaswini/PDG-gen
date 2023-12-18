import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		final int A = scan.nextInt();
		final int B = scan.nextInt();

		System.out.println(Math.max(A+B,Math.max(A-B,A*B)));
	}
}