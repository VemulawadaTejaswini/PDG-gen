import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.close();
		long h = H % 2 == 0 ? H / 2 : (H / 2) + 1;
		long w = W % 2 == 0 ? W / 2 : (W / 2) + 1;
		long h2 = W / 2; 
		long w2 = H / 2;
		System.out.println((long)(h * w) + (long)(h2 * w2));
	}
}
