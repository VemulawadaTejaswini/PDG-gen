import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int m = S.indexOf("C");
		int n = S.lastIndexOf("F");
		if (m<0 || n<0 || m>n) System.out.println("No");
		else System.out.println("Yes"); 
		sc.close();
	}

}
