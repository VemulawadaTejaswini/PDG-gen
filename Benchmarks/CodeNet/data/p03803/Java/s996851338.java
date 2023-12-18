import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int A,B;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		if(A == 1) {
			A += 13;
		}
		if(B == 1) {
			B += 13;
		}
		if(A < B) {
			System.out.println("Bob");
		}else if(A > B) {
			System.out.println("Alice");
		}else {
			System.out.println("Draw");
		}
		sc.close();
	}
}
