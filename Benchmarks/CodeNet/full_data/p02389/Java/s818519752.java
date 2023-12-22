import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int menseki,syuu;
		
		menseki = a * b;
		syuu = (a + b) * 2;
		
		System.out.println(menseki + " " + syuu);

	}

}