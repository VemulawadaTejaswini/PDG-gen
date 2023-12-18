import java.util.Scanner;

public class MAin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		S = S.replaceAll(",", " ");
		System.out.println(S);
	}
}