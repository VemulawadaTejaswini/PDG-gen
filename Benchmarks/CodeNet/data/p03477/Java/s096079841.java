import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		int left = A + B;
		int right = C + D;
		if(left > right) {
			System.out.println("Left");
		}else if(left < right) {
			System.out.println("Right");
		}else {
			System.out.println("Balanced");
		}

	}
}