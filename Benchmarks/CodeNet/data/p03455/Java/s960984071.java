import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		S += sc.next();
		sc.close();
		double num =  Math.sqrt((double)Integer.parseInt(S));

		System.out.println(num-(int)num==0?"Yes":"No");
	}

}
