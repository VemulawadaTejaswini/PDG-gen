import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		s.replaceAll("eraser", "-");
		s.replaceAll("erase", "-");
		s.replaceAll("dreamer", "-");
		s.replaceAll("dream", "-");
		s.replaceAll("-", "");
		System.out.println(s.length()==0 ? "Yes" : "No");
	}
}