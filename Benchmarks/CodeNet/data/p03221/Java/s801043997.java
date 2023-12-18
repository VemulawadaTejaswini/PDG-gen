import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		ArrayList<ArrayList<Integer>> P_num = new ArrayList<ArrayList<Integer>>();

		for(int i = 0;i < N+1;i++) {
			P_num.add(new ArrayList<Integer>());
		}

		int[] PA = new int[M];
		int[] YA = new int[M];

		for(int i = 0;i < M;i++) {
			int P = scn.nextInt();
			int Y = scn.nextInt();
			PA[i] = P;
			YA[i] = Y;
			ArrayList<Integer> A = P_num.get(P);
			A.add(Y);
		}

		for(int i = 0;i < N+1;i++) {
			ArrayList<Integer> A = P_num.get(i);
			A.sort(null);
		}



		for(int i = 0;i < M;i++) {
			int P = PA[i];
			int Y = YA[i];
			ArrayList<Integer> A = P_num.get(P);
			int z = find(A,Y) + 1;

			System.out.println(String.format("%06d", P) + String.format("%06d", z));


		}



	}

	public static int find(ArrayList<Integer> A,int Y) {
		int l = 0;
		int r = A.size();
		int p = (r - l)/ 2;
		int q;
		while(Y != A.get(p)) {
			if(Y > A.get(p)) {
				l = p;

				q = (r - l)/ 2;
				if(p == q) {
					p = q + 1;
				}else {
					p = q;
				}

			}else {
				r = p;
				q = (r - l)/ 2;
				if(p == q) {
					p = q -1;
				}else {
					p = q;
				}


			}

		}

		return p;
	}

}
