import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int menseki = 0;
		int shu = 0;

		a = sc.nextInt();
		b = sc.nextInt();

		menseki = a * b;
		shu = ( a * 2 ) + ( b * 2 );

		System.out.println( menseki + " " + shu );
	}
}