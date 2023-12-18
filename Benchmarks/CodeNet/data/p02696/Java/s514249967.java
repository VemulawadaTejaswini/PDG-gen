import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		System.out.println((int)(Math.floor(a*n/b)-a*Math.floor(n/b)));
	}

}