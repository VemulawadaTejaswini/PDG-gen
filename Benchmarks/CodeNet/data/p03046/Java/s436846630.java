import java.util.Scanner;

public class Main {

	private void solve() {
		Scanner in = new Scanner(System.in);
		int M = in.nextInt();
		int K = in.nextInt();
		
		if(M==0) {
			if(K==0) System.out.println("0 0");
			else returnNone();
			return;
		}
		if(M==1) {
			if(K==0) System.out.println("0 1 1 0");
			else returnNone();
			return;
		}
		
		double max = Math.pow(2,M)-1;
		
		if(K>max) {
			returnNone();
			return;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(K);
		for(int i=0;i<=max;i++) {
			if(i==K) continue;
			sb.append(" ");
			sb.append(i);
		}
		sb.append(" ");
		sb.append(K);
		for(int i=(int) max;i>=0;i--) {
			if(i==K) continue;
			sb.append(" ");
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
	
	private void returnNone() {
		System.out.println("-1");
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}