import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int []pm, pe, pj;
	public static void main(String[] args) {;
		// TODO 自動生成されたメソッド・スタブ
		while(read()) solve();
		
	}
	private static void solve() {
		// TODO 自動生成されたメソッド・スタブ
		for(int i=0; i<n; i++) {
			if(pm[i]==100 || pe[i]==100 || pj[i]==100) {
				System.out.println("A");
				continue;
			} else if(pm[i]+pe[i]>=180) {
				System.out.println("A");
				continue;
			} else if(pm[i]+pe[i]+pj[i]>=240) {
				System.out.println("A");
				continue;
			} else if(pm[i]+pe[i]+pj[i]>=210) {
				System.out.println("B");
				continue;
			} else if(pm[i]+pe[i]+pj[i]>=150 && (pm[i]>=80 || pe[i]>=80)) {
				System.out.println("B");
				continue;
			} else {
				System.out.println("C");
			}
		}
		
	}
	private static boolean read() {
		// TODO 自動生成されたメソッド・スタブ
		n = sc.nextInt();
		if(n==0) return false;
		pm = new int[n];
		pe = new int[n];
		pj = new int[n];
		for (int i = 0; i < n; i++) {
			pm[i] = sc.nextInt();
			pe[i] = sc.nextInt();
			pj[i] = sc.nextInt();
		}
	
		return true;
	}

	
}