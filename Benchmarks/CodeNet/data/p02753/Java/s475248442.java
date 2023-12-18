import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		if (S.indexOf("A") != -1 && S.indexOf("B") != -1)
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}
}