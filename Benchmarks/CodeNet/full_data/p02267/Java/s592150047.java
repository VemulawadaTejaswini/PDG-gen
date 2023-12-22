import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt(); 
		}
		int q = sc.nextInt();
		int[] T = new int[q];
		for(int i = 0; i < q; i++) {
			T[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < q; j++) {
				if(S[i] == T[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
