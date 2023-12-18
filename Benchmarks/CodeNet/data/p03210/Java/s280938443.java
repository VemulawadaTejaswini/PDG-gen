import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N == 7 || N == 5 || N == 3) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}