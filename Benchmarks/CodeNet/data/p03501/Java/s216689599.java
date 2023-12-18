import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T= Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();

		if(A * T < B) {
			System.out.println(A * T);
		}else {
			System.out.println(B);
		}

	}
}