import java.util.Arrays;
import java.util.Scanner;

public class Main{
	void run() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int[] S = new int[n];
		
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		Arrays.sort(S);
		int q = sc.nextInt();
		int[] T = new int[q];
		for(int j = 0; j < q; j++) {
			T[j] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			int left = 0;
			int right = n;
			while(left < right) {
				int mid = (left + right)/2;
				if(T[i] == S[mid]) {
					count++;
					break;
				}
				else if(T[i] < S[mid]) right = mid;
				else left = mid + 1;
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
