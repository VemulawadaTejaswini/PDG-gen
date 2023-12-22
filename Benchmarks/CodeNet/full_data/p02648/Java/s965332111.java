import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static class Pair implements Comparable<Pair>{
		int weight;
		int val;
		Pair(int w , int v){
			weight = w;
			val = v;
		}
		@Override
		public int compareTo(Pair o) {
			if(weight == o.weight){
				return o.val - val;
			}
			return weight - o.weight;
		}
		@Override
		public String toString() {
			return weight + " " + val;
		}
	}
	static Map<Integer, List<Pair>> memo;
	static List<Pair> memo(int v , int L , int[] V , int W[]){
		if(memo.containsKey(v)){
			return memo.get(v);
		}
		int memoV = v;
		int N = Integer.toBinaryString(v).length();
		int vs[] = new int[N];
		int ws[] = new int[N];
		int index = 0;
		while(v > 0){
			vs[index] = V[v - 1];
			ws[index] = W[v - 1];
			index++;
			v = v / 2;
		}
		List<Pair> ps = new ArrayList<Pair>();
		int result = 0;
		for(int i = 0 ; i < (1 << N) ; ++i){
			int val = 0;
			int weight = 0;
			for(int j = 0 ; j < N ; ++j){
				if(((1 << j) & i) != 0){
					val += vs[j];
					weight += ws[j];
				}
			}
			result = Math.max(result, val);
			ps.add(new Pair(weight , val));
		}
		Collections.sort(ps);
		int mv = 0;
		for(Pair p : ps){
			p.val = Math.max(p.val, mv);
			mv = Math.max(p.val, mv);
		}
		memo.put(memoV, ps);
		return ps;
	}
	static int solve(int v , int L , int[] V , int W[]){
		int B = 12;
		if(v < (1 << B)){
			List<Pair> ps = memo(v , L , V , W);
			int left = 0;
			int right = ps.size() - 1;
			if(ps.get(right).weight <= L){
				return ps.get(right).val;
			}
			while(right - left > 1){
				int mid = (left + right) / 2;
				Pair p = ps.get(mid);
				if(p.weight <= L){
					left = mid;
				}else{
					right = mid;
				}
			}
			return ps.get(left).val;
		}
		int N = Integer.toBinaryString(v).length() - B;
		int vs[] = new int[N];
		int ws[] = new int[N];
		int index = 0;
		while(v >= (1 << B)){
			vs[index] = V[v - 1];
			ws[index] = W[v - 1];
			index++;
			v = v / 2;
		}
		int result = 0;
		List<Pair> ps = memo(v , L , V , W);
		for(int i = 0 ; i < (1 << N) ; ++i){
			int val = 0;
			int weight = 0;
			for(int j = 0 ; j < N ; ++j){
				if(((1 << j) & i) != 0){
					val += vs[j];
					weight += ws[j];
				}
			}
			if(weight > L){
				continue;
			}
			int leftWeight = L - weight;
			int left = 0;
			int right = ps.size() - 1;
			if(ps.get(right).weight <= leftWeight){
				result = Math.max(result, val + ps.get(right).val);				
				continue;
			}
			while(right - left > 1){
				int mid = (left + right) / 2;
				Pair p = ps.get(mid);
				if(p.weight <= leftWeight){
					left = mid;
				}else{
					right = mid;
				}
			}
			result = Math.max(result, val + ps.get(left).val);
		}
		return result;
	}
	public static void main(String[] args) throws Exception{
		memo = new HashMap<Integer, List<Pair>>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int V[] = new int[N];
		int W[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			line = br.readLine();
			String a[] = line.split(" ");
			V[i] = Integer.parseInt(a[0]);
			W[i] = Integer.parseInt(a[1]);
		}
		line = br.readLine();
		int Q = Integer.parseInt(line);
		for(int i = 0 ; i < Q ; ++i){
			line = br.readLine();
			String a[] = line.split(" ");
			int v = Integer.parseInt(a[0]);
			int L = Integer.parseInt(a[1]);
			System.out.println(solve(v, L, V, W));
		}
	}
}
