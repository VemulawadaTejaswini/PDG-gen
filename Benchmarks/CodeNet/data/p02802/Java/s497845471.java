
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] wa = new int[n + 1];
		boolean[] ac = new boolean[n + 1];
		for(int i = 0; i < n + 1; i++) {
			wa[i] = 0;
			ac[i] = true;
		}
		for(int i = 0; i < m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if(s.equals("AC")) {
				ac[p] = false;
			} else if(ac[p]) {
				wa[p]++;
			}
		}
		int ansac = 0;
		int answa = 0;
		for(int i = 1; i < n + 1; i++) {
			if(ac[i] == false)
				ansac++;
			answa += wa[i];
		}
		System.out.println(ansac + " " + answa);
	}

}
