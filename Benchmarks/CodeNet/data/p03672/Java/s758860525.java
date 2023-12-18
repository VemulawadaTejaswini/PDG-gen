import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() % 2 == 1) {
			s = s.substring(0,s.length()-1);
		}
		for(;!(s.substring(0,s.length() / 2).equals(s.substring(s.length() / 2, s.length())));) {
			if(s.length() < 2) {
				System.out.println(-1);
				return;
			}
			s.substring(0,s.length()-2);
		}
		System.out.println(s.length());
	}
}
