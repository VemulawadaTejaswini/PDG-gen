import java.util.Scanner;

public class Main {
	
	private void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int ans = Integer.MAX_VALUE;
		for(int i=0;i*9<=N;i++) {
			ans = Math.min(ans, countOperation(i*9,9)+countOperation(N-i*9,6));
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
	
	public int countOperation(int value,int base) {
		int count = 0;
		while(value!=0) {
			count += value%base;
			value = value/base;
		}
		return count;
	}
}
