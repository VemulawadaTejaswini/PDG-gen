import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String sp = " ";

		System.out.println(a/b + sp + a%b + sp + (double)a/b);

	}

}

