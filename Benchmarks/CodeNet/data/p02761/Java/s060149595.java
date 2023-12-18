import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] seisu = new int[N];
		for (int i=0; i<N; i++) {
			seisu[i] = -1;
		}
		
		boolean NG = false;
		
		for (int i=0; i<M; i++) {
			int s = sc.nextInt();
			int c = sc.nextInt();
			if (s > N) {
				NG = true;
				break;
			}
			else if (s == 1 && c == 0) {
				NG = true;
				break;
			}
			else if (seisu[s - 1] != -1 && seisu[s - 1] != c) {
				NG = true;
				break;
			}
			else {
				seisu[s - 1] = c;
			}
		}

		StringBuilder ans = new StringBuilder();
		if (NG) {
			ans.append(-1);
		}
		else {
			if (seisu[0] == -1) {
				seisu[0] = 1;
			}
			
			for (int i = 0; i < N; i++) {
				ans.append(seisu[i] == -1 ? 0 : seisu[i]);
			}
		}
		
		System.out.println(ans);
	}
}