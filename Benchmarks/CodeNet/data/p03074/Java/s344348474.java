
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
		char S[] = sc.next().toCharArray();

		ArrayList<Integer>Nums = new ArrayList<>();
		int now = 1;
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(S[i] == (char)('0' + now)) {
				cnt++;
			}else {
				Nums.add(cnt);
				now = 1 - now;
				cnt = 1;
			}
		}
		if(cnt>0) Nums.add(cnt);

		if(Nums.size()%2==0) Nums.add(0);

		ArrayList<Integer>sums = new ArrayList<Integer>();
		sums.add(0);
		for(int i=0; i<Nums.size(); i++) {
			sums.add(i+1, sums.get(i) + Nums.get(i));
		}

		int add = 2 * K + 1;
		int ans = 0;
		for(int i=0; i<Nums.size(); i+=2) {
			int left = i;
			int right = Math.min(i + add, Nums.size());
			ans = Math.max(ans, sums.get(right) - sums.get(left));
		}
		System.out.println(ans);
		sc.close();
	}

}
