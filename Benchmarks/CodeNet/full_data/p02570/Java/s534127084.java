import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int S = sc.nextInt();
		int T = sc.nextInt();

		if(S*T >= D) {
			System.out.print("Yes");

		}
		else {
			System.out.print("No");
		}

    }
}
