import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//--- lt以下の要素を探索 ---//
	static int search(int[] c,int lt) {
		for(int i = lt; i >= 0; i--) {
			if(Arrays.binarySearch(c, i) >= 0) {
				return Arrays.binarySearch(c, i);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int Q = stdIn.nextInt();
		int[] c = new int[N];
		for(int i = 0; i < N; i++) {
			c[i] = stdIn.nextInt();
		}
		Arrays.sort(c);
		for(int i = 0; i < Q; i++) {
			int max = 0;
			int q = stdIn.nextInt();
			for(int j = c.length-1; j >= 0; j--) {
				if(c[j] % q > max) max = c[j] % q;
				int tmp = search(c,c[j]-c[j]%q-1);
				if(tmp == -1) {
					break;
				}
				else {
					j = tmp+1;
				}
			}
			System.out.println(max);
		}

		

	}
}