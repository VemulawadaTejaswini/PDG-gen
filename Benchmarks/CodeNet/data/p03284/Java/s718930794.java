import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();

		if(N % K == 0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}

	}
}