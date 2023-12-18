import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int A = Integer.parseInt(sc.next());
		sc.close();

		int check = N % 500;
		if(A >= check) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}