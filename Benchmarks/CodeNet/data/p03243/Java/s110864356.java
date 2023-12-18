import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		scan.close();
		int a = Integer.parseInt(n);
		for(int i = a; i <= 999; i++) {
			String k = Integer.toString(i);
			char c0 = k.charAt(0);
			char c1 = k.charAt(1);
			char c2 = k.charAt(2);
			if(c0 == c1 && c1 == c2) {
				System.out.println(k);
				System.exit(0);
			}
		}
	}
}