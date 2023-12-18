import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static int R,G,B,N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
		G = sc.nextInt();
		B = sc.nextInt();
		N = sc.nextInt();

//		ArrayList<Integer> rlist = new ArrayList<>();
//		ArrayList<Integer> glist = new ArrayList<>();
//		ArrayList<Integer> blist = new ArrayList<>();
//
//		rlist.add(0);
//		for (int i = R; i <= N; ) {
//			rlist.add(i);
//			i += R;
//		}
//		glist.add(0);
//		for (int i = G; i <= N; ) {
//			glist.add(i);
//			i += G;
//		}
//		blist.add(0);
//		for (int i = B; i <= N; ) {
//			blist.add(i);
//			i += B;
//		}

		//check(blist);

		int count = 0;

		for (int i = 0; i <= N; ) {
			for (int j = 0; j <= N; ) {
				int t = i + j;
				if ( t > N) {
					break;
				}
				for (int k = 0; k <= N ; ) {
					int tmp = i + j + k;
					if (tmp == N) {
						count++;
					}
					k += B;
				}
				j += G;
			}
			i += R;
		}
		System.out.println(count);
	}

	static void check(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
