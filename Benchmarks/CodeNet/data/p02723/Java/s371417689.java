import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String a=sc.next();
		System.out.println((a.charAt(2)==a.charAt(3))&&(a.charAt(4)==a.charAt(5)) ? "Yes":"No");
	}
}