import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.next();
		char[] c1=s.toCharArray();
		s=scan.next();
		char[] c2=s.toCharArray();
		scan.close();
		System.out.println((c1[0]==c2[2]&&c2[0]==c1[2])? "YES":"NO");

	}

}