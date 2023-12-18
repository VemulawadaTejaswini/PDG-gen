
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

		ArrayList<Integer> a = new ArrayList<>(); //スイッチと繋がっている電球の集合
		for(int i=0; i<N; i++) {
			a.add(0);
		}

		for(int i=0; i<M; i++) {
			int k=sc.nextInt();
			for(int j=0; j<k; j++) {
				int s = sc.nextInt();
				s--;
				a.set(s, a.get(s) | (1<<i));
			}
		}

		int p=0;
		for(int i=0; i<M; i++) {
			int x = sc.nextInt();
			p |= (x<<i);
		}

		//押すスイッチの全集合を試す
		int ans = 0;
		for(int s = 0; s < (1<<N); s++) {
			int t=0;//スイッチ押した後の電球の状態
			for(int i=0; i<N; i++) {
				if(((s>>i)&1)==1) {
					//スイッチiを押すと対応する電球が変化する
					t ^= a.get(i);
				}
			}
			if(p==t) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();
	}


}
