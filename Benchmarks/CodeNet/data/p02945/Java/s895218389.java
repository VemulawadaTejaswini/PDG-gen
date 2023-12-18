import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=Math.max(a+b, a-b);
		int d=Math.max(c, a*b);
		System.out.println(d);

	}

}
