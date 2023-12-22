import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			A.add(sc.nextInt());
		}
		for(int i = 0; i < M; i++) {
			B.add(sc.nextInt());
		}

		int ans = 0;
			while(K > 0 && A.size()!=0 && B.size()!=0) {
				if(A.get(0) < B.get(0)) {
					K -= A.get(0);
					A.remove(0);
					ans++;
				}
				else {
					K -= B.get(0);
					B.remove(0);
					ans++;
				}
			}
			if(A.size() > 0) {
				while(K > 0 && A.size()!=0) {
					K -= A.get(0);
					A.remove(0);
					ans++;
				}
			}
			if(B.size() > 0) {
				while(K > 0 && B.size()!=0) {
					K -= B.get(0);
					B.remove(0);
					ans++;
				}
			}

			System.out.println(K>=0?ans:--ans);

	}

}
