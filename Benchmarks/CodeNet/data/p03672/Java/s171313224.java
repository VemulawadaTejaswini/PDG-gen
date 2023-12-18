import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = 0;
		int l = s.length();
		for(int j = 0; j < l + 1; j++ ) {
			s = s.substring(0, l - j);
			for (int i = s.length() / 2; i > 0 ; i--) {
				if (s.substring(0, i).equals(s.substring(i, i * 2))){
					k = l - j;
					break;
				}
			}
		}
		System.out.println(k);
	}
}