import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a, b;
		int S, L;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		S = a * b;
		L = (a + b) * 2;
		System.out.println(S + " " + L);
	}

}