import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str=scan.next();
		int a=Integer.parseInt(str);

		String str2=scan.next();
		int b=Integer.parseInt(str2);
		System.out.print(a*b);
		System.out.print(" ");
		System.out.println(2*a+2*b);
	}

}