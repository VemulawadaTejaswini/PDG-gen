import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int N = sc.nextInt();

		int baseCount = 1;

		for (int i = 1; i <= D ; i++) {
			baseCount = baseCount * 100;
		}
		System.out.println(baseCount*N);

	}
}
