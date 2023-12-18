import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		int K = nextInt();
		char[] C = (next()+'-').toCharArray();
		List<Integer> nList = new ArrayList<>();
		List<Character> lrList = new ArrayList<>();
		PriorityQueue<Integer> pqLi = new PriorityQueue <Integer>((a1,a2)->MyComparator(nList.get(a1),nList.get(a2))); // index 降順
		PriorityQueue<Integer> pqRi = new PriorityQueue <Integer>((a1,a2)->MyComparator(nList.get(a1),nList.get(a2)));

		int cnt = 1;
		int sumL = 0;
		int sumR = 0;
		for(int i=1;i<=N;i++) {
			if(C[i-1] == C[i]) {
				cnt++;
			}else {
				nList.add(cnt);
				lrList.add(C[i-1]);
				if(C[i-1] == 'L') {
					pqLi.add(nList.size()-1);
				}
				else if(C[i-1] == 'R'){
					pqRi.add(nList.size()-1);
				}
				cnt = 1;
			}
		}
		int pqLlen = pqLi.size();
		int pqRlen = pqRi.size();
		List<Character> LKlrList = new ArrayList<>(lrList);
		List<Character> RKlrList = new ArrayList<>(lrList);

		for(int i=0;i<K;i++) {
			if(pqRi.size()>0) {
				int t = pqRi.poll();
				if(t == 0||t == pqRlen-1) {
					if(pqRi.size()>0)t = pqRi.poll();
				}
				LKlrList.set(t,'L');
			}
			if(pqLi.size()>0) {
				int t = pqLi.poll();
				if(t == 0||t == pqLlen-1) {
					if(pqLi.size()>0)t = pqLi.poll();
				}
				RKlrList.set(t,'R');
			}

		}

		nList.add(0);
		LKlrList.add('-');
		RKlrList.add('-');

		sumL=0;
		sumR=0;
		cnt = nList.get(0);

		for(int i=0;i<LKlrList.size()-1;i++) {
			if(LKlrList.get(i)==LKlrList.get(i+1)) {
				cnt += nList.get(i+1);
			}else {
				sumL += Math.max(cnt-1,0);
				cnt = nList.get(i+1);
			}
		}
		cnt = nList.get(0);
		for(int i=0;i<RKlrList.size()-1;i++) {
			if(RKlrList.get(i)==RKlrList.get(i+1)) {
				cnt += nList.get(i+1);
			}else {
				sumR += Math.max(cnt-1,0);
				cnt = nList.get(i+1);
			}
		}

		out.println(Math.max(sumL, sumR));
	}
	private int MyComparator(int a1, int a2) {
		if(a1 < a2) return 1;
		else if(a1 > a2) return -1;
		return 0;
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}