import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			int[] Ai = new int[N];
			int[] Sumi = new int[N];

			int sum = 0;
			for(int i = 1; i < N; i++) {
				Ai[i] = scn.nextInt();
			}


			for(int i = 1; i < N; i++) {
				Sumi[Ai[i]-1]++;
			}


			for(int i = 0; i < N; i++) {
				System.out.println(Sumi[i]);
			}
		}
	}
}