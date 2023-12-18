import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int N = Integer.parseInt(sc.next());
			int Q = Integer.parseInt(sc.next());
			String S = sc.next();
			int[][] lr = new int[Q][2];
			for(int i = 0; i < Q; i ++) {
				lr[i][0] = Integer.parseInt(sc.next());
				lr[i][1] = Integer.parseInt(sc.next());
			}
			final String AC = "AC";
			int[] counter = new int[S.length()];
			int hitposition = 0;
			for(int i = 0; i < S.length();) {
				hitposition = S.substring(i).indexOf(AC) + 1;
				if(hitposition == 0) break;
				i += hitposition;
				int count = i;
				for(;count < S.length(); count ++) {
					counter[count]++;
				}
				i++;
			}
			
			for(int i = 0; i < Q; i++) {
				System.out.println(counter[lr[i][1] -1] - counter[lr[i][0] -1]);
			}
			
			//System.out.println(ret);
		} // Scanner Close
	}
}