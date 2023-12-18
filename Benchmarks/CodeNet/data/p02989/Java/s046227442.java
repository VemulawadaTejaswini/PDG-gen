import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] Q = new int[N];
		int anser = 0;
		for(int i = 0; i<N ; i++) {
			Q[i] = sc.nextInt();
		}
		Arrays.sort(Q);
		for(int K = 1 ; K <= Q[N-1] ;K++) {
			int max = 0;
			int min = 0;
			for(int handan = 0; handan < N ; handan++) {
				if(Q[handan] >= K) {
					 max++;
				}else if(Q[handan] < K) {
					 min++;
				}
			}
			anser += max == min? 1:0;
		}
		System.out.println(anser);

	}
}