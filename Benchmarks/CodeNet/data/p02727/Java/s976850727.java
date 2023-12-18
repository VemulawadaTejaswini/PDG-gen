import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		int Y = input.nextInt();
		long answer = 0;
		int numRed = input.nextInt();
		int numGreen = input.nextInt();
		int ALT = input.nextInt();
		int[] R = new int[numRed];
		int[] G = new int[numGreen];
		int[] C = new int[ALT];
		for (int i = 0; i < numRed; i++) {
			R[i] = input.nextInt();
		}
		for (int i = 0; i < numGreen; i++) {
			G[i] = input.nextInt();
		}
		for (int i = 0; i < ALT; i++) {
			C[i] = input.nextInt();
		}
		Arrays.sort(R); Arrays.sort(G); Arrays.sort(C);
		numRed--; --ALT; --numGreen;
		while (X>0) {
			if (R[numRed]>=C[ALT]||ALT<0) {
				answer+=R[numRed];
				--numRed;
			}else {
				answer+=C[ALT];
				--ALT;
			} 
			--X;
		}
		while (Y>0) {
			if (G[numGreen]>=C[ALT]||ALT<0) {
				answer+=G[numGreen];
				--numGreen;
			}else {
				answer+=C[ALT];
				--ALT;
			}
			--Y;
		}
		System.out.println(answer);
	}
}