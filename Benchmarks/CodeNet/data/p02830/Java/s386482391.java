
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();
		char s ;
		char t ;
		String str= "";

		for(int i=0;i<N;i++) {
			s = S.charAt(i);
			t = T.charAt(i);
			str += String.valueOf(s) + String.valueOf(t);

		}


		System.out.println(str);
	}

}
