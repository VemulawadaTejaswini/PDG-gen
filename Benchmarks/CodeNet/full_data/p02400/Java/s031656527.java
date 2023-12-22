import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner( System.in);	
		int r;

		r=kb.nextInt();

		System.out.printf( "%f %f\n", (double)r*r*Math.PI, (double)r*2*Math.PI );	
	}
}