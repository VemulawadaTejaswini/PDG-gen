import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int T = sc.nextInt();
		int A = sc.nextInt();
		int difference = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < H.length; i++) {
			int input = sc.nextInt();
			H[i] = Math.abs(A - (int) ((double) T - input * 0.006));
			if (difference > H[i]) {
				difference = H[i];
				index = i + 1;
			}
		}
		System.out.println(index);
		sc.close();
	}
}