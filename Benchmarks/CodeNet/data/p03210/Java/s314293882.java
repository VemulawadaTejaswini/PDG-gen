import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());

		if(N == 3 || N == 5 || N == 7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
