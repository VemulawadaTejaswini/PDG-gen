import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int A = sc.nextInt();
	static int B = sc.nextInt();
	static int[] P = new int[N];
	static {
		Arrays.setAll(P, i -> sc.nextInt());
	}
	public static void main(String[] args) {
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < P.length; i++) {
			if (P[i]<=A) {
				count1++;
			}
			if (P[i]>A && P[i] <= B) {
				count2++;
			}
			if (P[i] > B) {
				count3++;
			}
		}
		int ans = Math.min(count1, Math.min(count2, count3));
		System.out.println(ans);
	}
}