import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		execute5_2();
	}
	
	private static void execute5_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			long[] a = new long[N];
			
			for(int i=0; i<N;i++) {
				a[i] = sc.nextLong();
			}
			
			Arrays.sort(a);
			
			long ans =0;
			for(int i=N-1;i>=0;i--) {
				if(0<K) {
					K--;
					continue;
				}
				ans+=a[i];
			}
			System.out.println(ans);
		}
	}
}