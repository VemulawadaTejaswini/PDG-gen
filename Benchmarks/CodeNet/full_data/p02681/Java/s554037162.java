import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		
		if (S.length() + 1 == T.length() && T.contains(S))
			System.out.println("Yes");
		else 
			System.out.println("No");
	}
}