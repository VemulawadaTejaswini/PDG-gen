import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if(A>B) {
			System.out.println(-1);
			return;
		}

		if(B>1.25*A || 1.25*A > B) {
			System.out.println(-1);
		} else {
			System.out.println(Math.max((int)(A*12.5)+1, (int)(B*10)));
		}

	}
}