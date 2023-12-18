import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		String sl[] = str.split(" ");
		int a = Integer.parseInt(sl[0]);
		int b = Integer.parseInt(sl[1]);
		int c = Integer.parseInt(sl[2]);

		System.out.println(a + b >= c ? "Yes" : "No");
	}
}