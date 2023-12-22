import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ans = 0;
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

		for(int i = 0;i < N;i++) {
			A.add(scan.nextInt());
		}

		for(int i = 0;i < M;i++) {
			B.add(scan.nextInt());
		}

		A.add(1000000001);
		B.add(1000000001);

		while(true) {
			if(A.get(0) > B.get(0)) {
				K -= B.get(0);
				B.remove(0);
			}else {
				K -= A.get(0);
				A.remove(0);
			}

			if(K < 0) {
				break;
			}

			ans++;
		}

		System.out.println(ans);

	}
}