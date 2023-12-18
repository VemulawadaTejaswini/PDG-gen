import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String SFT = sc.next();
		if (SFT.equals("7") || SFT.equals("5") || SFT.equals("3")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
