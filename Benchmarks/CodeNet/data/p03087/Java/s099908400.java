import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String S = sc.next();
		
		Integer[][] A = new Integer[Q][2];
		
		for ( int i = 0; i < Q; i++ ) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}
		
		for ( int i = 0; i < Q; i++ ) {
			String s_str = S.substring(A[i][0] - 1, A[i][1]);
			int cnt = 0;
			
			for (int j = 0; j < s_str.length() - 1; j++) {
				
				if (s_str.substring(j, j + 2).equals("AC")) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}