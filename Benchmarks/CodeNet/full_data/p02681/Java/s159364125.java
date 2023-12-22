import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int sSize = s.length();

		String tMinus1 = t.substring(0, sSize);

		if (tMinus1.equals(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}
}
