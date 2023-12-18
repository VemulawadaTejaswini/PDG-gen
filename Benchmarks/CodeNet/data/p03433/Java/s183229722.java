import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		if (N % 500 == 0) {
			System.out.println("yes");
		} else if (N % 500 <= A) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
}