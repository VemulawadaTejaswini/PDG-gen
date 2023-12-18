import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();
		scan.close();

		char[] cs =s.toCharArray();
		char[] ct =s.toCharArray();
		for(int i=0;i<s.length();i++) {

			System.out.print(cs[i]+ct[i]);
		}
		System.out.println();
	}

}