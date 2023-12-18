import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> D = new ArrayList<Integer>();
		ArrayList<Integer> M = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();

		int N = scn.nextInt();

		scn.nextLine();
		String S = scn.nextLine();
		for(int i = 0;i < N;i++) {
			char c = S.charAt(i);
			switch(c) {
			case 'D':
				D.add(i);
				break;
			case 'M':
				M.add(i);
				break;
			case 'C':
				C.add(i);
				break;
			default:
			}
		}

		int Q = scn.nextInt();
		int K[] = new int[Q];
		int k_max = 0;
		for(int i = 0; i < Q;i++) {
			int k = scn.nextInt();
			K[i] = k;
			k_max = Math.max(k,k_max);

			System.out.println(DMC_check(D,M,C,k));
		}



		scn.close();
	}


	public static int DMC_check(ArrayList<Integer> D,ArrayList<Integer> M,ArrayList<Integer> C,int K) {
		int ans = 0;
		int Ds = D.size(), Ms = M.size(), Cs = C.size();

		for(int i = 0;i < Ds;i++) {
			int a = D.get(i);
			for(int j = 0;j < Ms;j++) {
				int b = M.get(j);
				if(b - a >= K)break;
				if(b < a)continue;

				for(int k = 0;k < Cs;k++) {
					int c = C.get(k);
					if(c - a >= K)break;
					if( c < b || c < a)continue;
					ans++;
				}
			}
		}
		return ans;
	}
}
