import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		K -= Math.min(K, A);
		int ak = K;
		K -= Math.min(K, B);
		int ck = -K;
		System.out.println(ak + ck);
		sc.close();
	}
}
