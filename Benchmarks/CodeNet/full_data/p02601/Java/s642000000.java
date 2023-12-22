import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int K = scanner.nextInt();

		int x1 = 0;
		while (B <= A) {
			B = B * 2;
			x1++;
		}
		int x2 = 0;
		while (C <= B) {
			C = C * 2;
			x2++;
		}
		if( x1 + x2  > K){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		scanner.close();
	}
}