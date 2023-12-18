import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < M;i++) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			if(a == 1) {
				A.add(b);
			}
			if(b == N) {
				B.add(a);
			}
		}

		boolean ans = false;
		for(int i = 0;i < A.size();i++) {
			ans = B.contains(A.get(i));
			if(ans)break;
		}
		System.out.println(ans?"POSSIBLE":"IMPOSSIBLE");
	}

}
