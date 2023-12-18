
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] L = new int[N * 2];
		for (int i = 0; i < L.length; i++) {
			L[i] = in.nextInt();
		}
		Arrays.sort(L);
		int ans = 0;
		for (int i = 0; i < L.length; i += 2) {
			ans += L[i];
		}
		System.out.println(ans);
		in.close();
	}
}