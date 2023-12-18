import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		if(A != 1 && ( A < B || B == 1)) System.out.print("Bob");
		else if(B != 1 && (A > B || A == 1)) System.out.print("Alice");
		else if(A == B) System.out.print("Draw");
	}
}