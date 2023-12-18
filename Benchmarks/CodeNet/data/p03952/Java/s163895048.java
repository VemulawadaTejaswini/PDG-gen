import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		if (N!=x) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			for(int i=1; i<=2*N-1; i++) System.out.println(i);
		}
		sc.close();
	}
}
