import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		boolean isok = ((Math.sqrt(a) + Math.sqrt(b))) < Math.sqrt(c);
		if (isok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
