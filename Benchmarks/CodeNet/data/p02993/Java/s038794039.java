import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String b = "Good";
		char a = 0;
		for(int i=0; i<S.length(); i++) {
			if(a == S.charAt(i)) {
				b = "Bad";
			}
			a = S.charAt(i);
		}
		System.out.println(b);
	}

}
