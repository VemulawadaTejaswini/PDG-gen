
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
		ArrayList<Integer> V = new ArrayList<>();
		for(int i=0; i<N; i++) {
			V.add(sc.nextInt());
		}

		long ans = 0;
		for(int l=0; l<=K; l++) {
			for(int r=0; r<=K; r++) {

				if(l+r>K) continue;

				int d = K-(l+r);
				ArrayList<Integer> s = new ArrayList<>();
				long tmp=0;

				for(int i=0; i<l; i++) {
					tmp += V.get(i);
					s.add(V.get(i));
				}

				for(int i=N-r; i<N; i++) {
					tmp += V.get(i);
					s.add(V.get(i));
				}

				Collections.sort(s);
				for(int i=0; i<d; i++) {
					if(s.size()<=i) break;
					if(s.get(i)>=0) break;
					tmp -= s.get(i);
				}
				ans = Math.max(tmp, ans);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
