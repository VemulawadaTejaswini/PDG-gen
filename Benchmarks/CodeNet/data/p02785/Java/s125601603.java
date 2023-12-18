import java.util.*;
public class Beginner153C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
	
		int[] H = new int[N];
		
		int count = 0;

		for (int i=0;i<N;i++) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);
		
		for (int i=0;i<H.length-K;i++) {
			count += H[i];
		}

		System.out.println(count);
		
	}
}
