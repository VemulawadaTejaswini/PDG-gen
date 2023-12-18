import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		sc.nextLine();
		
		final int[] hs = new int[N];
		for (int i = 0; i < N; i++) {
			hs[i] = sc.nextInt();
		}
		
		int count = 0;
		while (true) {
			int l = -1;
			for (int i = 0; i < N; i++) {
				final int h = hs[i];
				if (h > 0) {
					if (l < 0) {
						l = i;
					}
				} else {
					if (l >= 0) {
						// supply water
						for (int j = l; j < i; j++) {
							hs[j] = hs[j] - 1;
						}
						count++;
					}
					
					l = -1;
				}
			}
			
			if (l >= 0) {
				// supply water
				for (int j = l; j < N; j++) {
					hs[j] = hs[j] - 1;
				}
				count++;
			}
			
			if (Arrays.stream(hs).allMatch(j -> j == 0)) {
				break;
			}
		}
		
		System.out.println(count);
	}

}