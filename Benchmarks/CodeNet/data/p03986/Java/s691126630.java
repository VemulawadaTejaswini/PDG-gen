import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();

		for(int i = 0; i < X.length()-1; i++) {
			if(X.charAt(i) == 'S' && X.charAt(i+1) == 'T') {
				String f = X.substring(0, i);
				String b = X.substring(i+2);
				X = f+b;
				i = -1;
			}
		}

		System.out.println(X.length());
	}

}
