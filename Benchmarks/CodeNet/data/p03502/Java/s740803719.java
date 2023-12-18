import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		String nstr=String.valueOf(n);
		int fx=0;
		for(int i=0;i<nstr.length();i++) {
			fx+=Character.getNumericValue(nstr.charAt(i));
		}
		System.out.println((n%fx==0)? "Yes":"No");
	}

}