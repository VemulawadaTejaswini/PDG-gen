import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		final long a = sc.nextLong();
		final long b = sc.nextLong();
		
		System.out.println((a * b) + " " + (2 * (a + b)));
		
	}
	
}