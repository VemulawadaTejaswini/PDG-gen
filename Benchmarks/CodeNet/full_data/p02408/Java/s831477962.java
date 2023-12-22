import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] S = new int[13];
		Arrays.fill(S, 1);
		int[] H = new int[13];
		Arrays.fill(H, 1);
		int[] C = new int[13];
		Arrays.fill(C, 1);
		int[] D = new int[13];
		Arrays.fill(D, 1);
		
		for(int i = 0; i < n; i++) {
			String suit = sc.next();
			int r = sc.nextInt();
			switch(suit) {
				case "S":
					S[r - 1] = 0;
					break;
				case "H":
					H[r - 1] = 0;
					break;
				case "C":
					C[r - 1] = 0;
					break;
				case "D":
					D[r - 1] = 0;
					break;
			}
		}
		for(int i = 0; i < 13; i++) {
			if(S[i] == 1) {
				System.out.println("S " + (i + 1));
			}
		}
		for(int i = 0; i < 13; i++) {
			if(H[i] == 1) {
				System.out.println("H " + (i + 1));
			}
		}
		for(int i = 0; i < 13; i++) {
			if(C[i] == 1) {
				System.out.println("C " + (i + 1));
			}
		}
		for(int i = 0; i < 13; i++) {
			if(D[i] == 1) {
				System.out.println("D " + (i + 1));
			}
		}
		sc.close();
	}
}

