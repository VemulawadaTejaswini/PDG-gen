import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int left = A + B;
		int right = C + D;
		if (left > right)
			System.out.println("Left");
		else if (left == right)
			System.out.println("Balanced");
		else {
			System.out.println("Right");
		}
		sc.close();
	}
}