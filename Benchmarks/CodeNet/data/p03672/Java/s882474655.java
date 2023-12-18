import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int s_length = s.length();
		int i = 0;
		int str = 0;
		for(i = 1; i < s_length; i++) {
			if((s_length - i) % 2 == 0) {
				if(s.substring(0, (s_length - i) / 2).equals(s.substring((s_length - i) / 2, s_length - i))) {
					str = s_length - i;
				}
			}
		}
		System.out.println(str);
	}
}