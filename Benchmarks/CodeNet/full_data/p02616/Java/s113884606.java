import java.util.*;

public class Main {

	static int mod = 1_000_000_007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N];
		ArrayList<Integer> plus = new ArrayList<Integer>();
		ArrayList<Integer> minus = new ArrayList<Integer>();
		int zero_cnt = 0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (A[i]>0) plus.add(A[i]);
			if (A[i]<0) minus.add(-A[i]);
			if (A[i]==0) zero_cnt++;
		}

		if (N==K) {
			long ans = 1L;
			for (int i=0;i<N;i++) {
				long val = A[i];
				if (val<0) {
					val += mod;
				}
				ans = ans*val%mod;
			}
			System.out.println(ans);
			return;
		}

		if (plus.size()==0 && K%2==1) {
			if (zero_cnt>0) {
				System.out.println(0);
				return;
			} else {
				Collections.sort(minus);
				long aaa = 1L;
				for (int i=0;i<K;i++) {
					aaa = aaa*(mod-minus.get(i))%mod;
				}
				System.out.println(aaa);
				return;
			}
		}

		Collections.sort(plus, (o1, o2)->Integer.compare(o2, o1));
		Collections.sort(minus, (o1, o2)->Integer.compare(o2, o1));
		long ans = 1L;
		if (K%2==1) {
			ans = plus.get(0);
			plus.remove(0);
		}
		TreeMap<Long, Integer> map = new TreeMap<Long, Integer>();
		for (int i=0;i<plus.size()/2;i++) {
			long tmp = (long)plus.get(2*i)*plus.get(2*i+1);
			if (map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp)+1);
			} else {
				map.put(tmp, 1);
			}
		}
		for (int i=0;i<minus.size()/2;i++) {
			long tmp = (long)minus.get(2*i)*minus.get(2*i+1);
			if (map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp)+1);
			} else {
				map.put(tmp, 1);
			}
		}
		for (int i=0;i<K/2;i++) {
			if (map.size() == 0) {
				if (zero_cnt>0) System.out.println(0);
				return;
			}
			long last_key = map.lastKey();
			ans = ans*(last_key%mod)%mod;
			if (map.get(last_key)>1) {
				map.put(last_key, map.get(last_key)-1);
			} else {
				map.remove(last_key);
			}
		}
		System.out.println(ans);
	}
}