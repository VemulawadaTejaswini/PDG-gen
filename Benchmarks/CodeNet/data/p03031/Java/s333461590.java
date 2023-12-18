
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();

		ArrayList<ArrayList<Integer>> sll = new ArrayList<>();
		ArrayList<Integer>pl = new ArrayList<>();
		for(int i=0; i<M; i++) {
			sll.add(new ArrayList<Integer>());
			int k=sc.nextInt();
			for(int j=0; j<k; j++) {
				int s=sc.nextInt();
				s--;
				sll.get(i).add(s);
			}
		}
		for(int i=0; i<M; i++) {
			int p=sc.nextInt();
			pl.add(p);
		}

		int ans = 0;

		//スイッチ全状態
		for(int b=0; b<(1<<N); b++) {

			boolean ok=true;


			for(int i=0; i<M; i++) {
				ArrayList<Integer> sl = sll.get(i);
				int cnt = 0;
				//電球につながっているスイッチ
				for(int j=0; j<sl.size(); j++) {
					int sn = sl.get(j);
					if(((b>>sn)&1)==1) {
						cnt++;
					}
				}
				if(cnt%2!=pl.get(i)) {
					ok=false;
					break;
				}
			}

			if(ok) {
				ans++;
			}

		}

		System.out.println(ans);

		sc.close();
	}


}
