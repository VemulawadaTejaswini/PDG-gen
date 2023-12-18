import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if (S.length() == 2)
			System.out.println(S);
		else
			System.out.println(S.charAt(2) +"" +S.charAt(1)+"" +S.charAt(0));
	}
}	
