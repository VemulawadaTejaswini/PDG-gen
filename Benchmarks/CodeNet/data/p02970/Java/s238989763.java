import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		if(N % (2 * D + 1) == 0) {
			System.out.println(N / (2 * D + 1));
		}else {
			System.out.println(N / (2 * D + 1) + 1);
		}

	}

}