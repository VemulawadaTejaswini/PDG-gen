import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.replaceAll("A", "");
		String str = "KIHBR";
		if(s.equals(str)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}