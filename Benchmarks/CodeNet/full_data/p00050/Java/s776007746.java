import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		s = sc.nextLine();

		s = s.replaceAll("apple", "tmpP");
		s = s.replaceAll("peach", "tmpA");
		s = s.replaceAll("tmpOfP", "peach");
		s = s.replaceAll("tmpOfA", "apple");
		
		System.out.println(s);
	}
}