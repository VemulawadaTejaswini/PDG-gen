import java.util.Scanner;

public class Main {
	static String S;
	static String T;
	static int n;
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		S=sc.next();
		T=sc.next();
		n=S.length();
		T=T.substring(0,n);
		if(S.equals(T)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}