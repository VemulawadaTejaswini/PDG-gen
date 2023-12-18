import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		int T = sc.nextInt();
		int A = sc.nextInt();
		int index = 0;
		for (int i = 0; i < H.length; i++) {
			H[i] = sc.nextInt();
		}
		for (int i = 0; i < H.length; i++) {
			for (int j = i + 1; j < H.length; j++) {
				int iDiff = A - (int) ((double) T - H[i] * 0.006);
				int jDiff = A - (int) ((double) T - H[j] * 0.006);
				if (iDiff > jDiff) {
					index = j;
				}
			}
		}
		System.out.println(index + 1);
		sc.close();
	}
}