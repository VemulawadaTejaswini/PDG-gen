import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		StringBuffer sb = new StringBuffer(t);
		t = sb.reverse().toString();
		if(s.equals(t)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}