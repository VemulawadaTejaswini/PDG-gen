import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int K = stdIn.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i ++) {
			A.add(stdIn.nextInt());
		}
		for(int i = 0; i < M; i ++) {
			B.add(stdIn.nextInt());
		}
		
		long time = 0;
		int ans = 0;
		int idxA = 0;
		int idxB = 0;
		while(true) {
			boolean flagA = false;
			boolean flagB = false;
			if(idxA < N && idxB < M) {
				if(A.get(idxA) <= B.get(idxB)) {
					time += A.get(idxA);
					flagA = true;
				}else {
					time += B.get(idxB);
					flagB = true;
				}
			}else if(idxA < N && M <= idxB) {
				time += A.get(idxA);
				flagA = true;
			}else if(N <= idxA && idxB < M) {
				time += B.get(idxB);
				flagB = true;
			}else {
				break;
			}
			System.out.println(time);
			if(time <= K) {
				if(flagA) {
					idxA ++;
				}
				if(flagB) {
					idxB ++;
				}
				ans ++;
			}else {
				break;
			}
			
		}
		
		System.out.println(ans);
	}
}