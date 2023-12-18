import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());

		String S = sc.next();

		for (int q=0; q<Q; q++){
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());

			int ans = 0;
			String s_q = S.substring(l-1, r);


			for(int i=0; i<r-l; i++){
				if (s_q.substring(i, i+2).equals("AC")){
					ans += 1;
				}
			}
			System.out.println(ans);
		}
	}
}
