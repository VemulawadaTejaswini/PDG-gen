import java.util.Scanner;

public class Main {
	private static Main instance = new Main();
	
	private Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		instance.solve();
	}
	
	private void solve() {
		int n = scanner.nextInt();
		int tVotes = scanner.nextInt();
		int aVotes = scanner.nextInt();
		
		for(int i=1;i<n;i++) {
			int t = scanner.nextInt();
			int a = scanner.nextInt();
			
			// tとaは互いに素
			if(t == a) {
				if(tVotes > aVotes) {
					aVotes = tVotes;
				} else {
					tVotes = aVotes;
				}
			} else if(t > a) {
				int modA = aVotes % a;
				if(modA > 0) {
					aVotes = aVotes + (a - modA);
				}
				while(aVotes / a * t < tVotes) {
					aVotes += a;
				}
				tVotes = aVotes / a * t;
			} else {
				int modT = tVotes % t;
				if(modT > 0) {
					tVotes = tVotes + (t - modT);
				}
				while(tVotes / t * a < aVotes) {
					tVotes += t;
				}
				aVotes = tVotes / t * a;
			}
		}
		System.out.printf("%d", tVotes+aVotes);
	}
}
