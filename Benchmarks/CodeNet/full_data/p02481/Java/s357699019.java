import java.util.Scanner;
 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int S=0,L=0;
		S = a*b;
		L = 2*a+2*b;
		System.out.println(S+" "+ L);
	}

}