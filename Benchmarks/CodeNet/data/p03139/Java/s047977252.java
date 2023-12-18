import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A>B) {
			System.out.print(A+" ");
		} else {
			System.out.print(B+" ");
		}
		if (A+B>N) {
			System.out.println(A+B-N);
		} else {
			System.out.println(0);
		}
	}
}
