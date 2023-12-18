import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] cardCount = new int[N+1];
		for(int i=0; i<M; i++) {
			int L = in.nextInt()-1;
			int R = in.nextInt()-1;
			cardCount[L] ++;
			cardCount[R+1] --;
		}
		int ans = 0;
		for(int i=0; i<N; i++) {
			if(cardCount[i]==M) ans++;
			cardCount[i+1] += cardCount[i];
		}
		System.out.println(ans);
	}
	
	private int countHead(int start, int target) {
		int count = 0;
		while(target > start) {
			start = start*2;
			count ++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
