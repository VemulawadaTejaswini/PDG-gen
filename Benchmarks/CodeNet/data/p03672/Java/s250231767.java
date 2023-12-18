import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length() % 2 == 1) {
			s = s.substring(0,s.length()-1);
		}
		while(true) {
			String front = s.substring(0,s.length() / 2);
			String back = s.substring(s.length() / 2);
			if(front.equals(back)) {
				System.out.println(front + " " + back);
				break;
			} else {
				s = s.substring(0,s.length()-2);
			}
		}
		System.out.println(s.length());
	}
}
