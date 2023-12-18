import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		
		for(int i = 0; i < N; i++) {
		    h[i] = sc.nextInt();
		}
		
		Arrays.sort(h);
        
        int minDiff = Integer.MAX_VALUE;
		for(int i = 0; i < (N - K + 1); i++) {
		    int diff = h[i + K - 1] - h[i];
		    if (diff < minDiff) {
		        minDiff = diff;
		    }
		}
		System.out.println(minDiff);
	}
}