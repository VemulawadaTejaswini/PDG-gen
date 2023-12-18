import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A = "); int a = sc.nextInt();
		System.out.print("B = "); int b = sc.nextInt();
		System.out.print("X = "); int x = sc.nextInt();

		if(a <= x && x <= a + b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}
