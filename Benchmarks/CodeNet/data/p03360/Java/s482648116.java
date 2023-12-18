import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, E, K;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		K = sc.nextInt();
		D = Math.max(A, B);
		E = Math.max(D, C);
		for(int i =0;i<K;i++) {
			E=E*2;
		}
		System.out.println(A+B+E);
		sc.close();
	}

}
