import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean A=sc.nextLine().equals("BBB");
		boolean B=sc.nextLine().equals("AAA");
		System.out.println(A||B?"NO":"YES");
	}
}
