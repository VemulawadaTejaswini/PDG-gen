import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();

		ArrayList<Integer>V = new ArrayList<>();
		for(int i=0; i<N; i++) {
			V.add(sc.nextInt());
		}

		int CNT = Math.min(N, K);

		int ans = 0;
		for(int A=0; A<=CNT; A++) {
			ArrayList<Integer> al = new ArrayList<>();
			int asum = 0;
			for(int i=0; i<A; i++) {
				al.add(V.get(i));
				asum += V.get(i);
			}
			for(int B=0; B<=CNT-A; B++) {
				ArrayList<Integer> bl = new ArrayList<>();
				int bsum = 0;
				for(int i=0; i<B; i++) {
					bl.add(V.get(N-1-i));
					bsum += V.get(N-1-i);
				}

				ArrayList<Integer> abl = new ArrayList<>(al);
				abl.addAll(bl);
				Collections.sort(abl);
				int absum = asum+bsum;
				int BC = Math.min(abl.size(), K-abl.size());

				for(int j=0; j<BC; j++) {
					if(abl.get(j)>=0) break;
					absum -= abl.get(j);
				}
				ans = Math.max(ans, absum);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
