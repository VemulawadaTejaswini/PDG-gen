import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		String str=String.valueOf(n);
		
		for(int i=0;i<str.length();i++) {
			System.out.print((str.charAt(i)==1)? "9" : ((str.charAt(i)==9)? "1":(str.charAt(i))));
		}
		System.out.println();
    }
}