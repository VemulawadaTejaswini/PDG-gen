import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2= sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(H2*60 - H1*60 + M1 - M2 - K);

	}
}

