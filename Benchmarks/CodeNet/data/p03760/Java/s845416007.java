import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		
		String S = "";
		
		for(int i = 0; i < E.length(); i++) {
			S += O.substring(i, i + 1) + E.substring(i, i + 1);
		}
		
		if(O.length() - E.length() == 1) {
			System.out.println(S + O.substring(O.length() - 1, O.length()));
		} else {
			System.out.println(S);
		}
		
		
		
	}
}
