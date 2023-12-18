import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		String S = scan.next();
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			if (c == 'R') {
				R.add(i);
			} else if (c == 'G') {
				G.add(i);
			} else if (c == 'B') {
				B.add(i);
			}
		}
		int ans = R.size()*G.size()*B.size();

		for (int i = 0; i < N-2; i++) {
			for (int j = i+1; j < N-1; j++) {
				if (2*j-i > N-1) break;
				char p = S.charAt(i);
				char q = S.charAt(j);
				char r = S.charAt(2*j-i);

				if (p != q && q != r && r != p) {
					ans--;
				}
			}
		}

		System.out.println(ans);
	}

}