import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int h = sc.nextInt();
		String s = sc.next();

		sc.close();
			System.out.println(s.equals("BBB") || s.equals("AAA") ? "No" : "Yes");


	}

}
