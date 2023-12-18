
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		boolean possible = false;
		for(int i = 0; i < M; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
		}
		for(int i = 0; i < M; i++) {
			if(a[i] == 1) {
				for(int j = 0; j < M; j++) {
					if(a[j] == b[i]) {
						if(b[j] == N) {
							possible = true;
							break;
						}
					}
				}
				if(possible) {
					break;
				}
			}
		}
		System.out.println(possible ? "POSSIBLE" : "IMPOSSIBLE");
		scan.close();

	}

}
