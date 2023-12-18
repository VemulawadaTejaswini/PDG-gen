import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int s_length = s.length(); 
		int i = 0;
		int j = 0;
		for(i = 0; i < s_length; i++) {
			if(s.charAt(i) == 'A') {
				break;
			}
		}
		for(j = s_length - 1; j >= 0; j--) {
			if(s.charAt(j) == 'Z') {
				break;
			}
		}
		String str = s.substring(i, j + 1);
		System.out.println(str.length());
	}
}