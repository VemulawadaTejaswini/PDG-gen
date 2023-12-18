import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {
	static HashMap<Integer, Integer> primefactors;
	static int max = 0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader br = new BufferedReader(new FileReader("input"));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a[] = new int[n];
		primefactors = new HashMap<>();
		while(n-->0) {
			a[n] = Integer.parseInt(st.nextToken());
			pf(a[n]);
		}
		long lcm = 1;
		for(Entry<Integer, Integer> ent:primefactors.entrySet()) {
			lcm *= pow(ent.getKey(),ent.getValue());
		}

		long ans = 0;
		for(int e:a) {
			ans += lcm/e;
			ans%= (1e9 + 7);
		}
		out.println(ans);
		out.flush();
	}
	static int pow(int n, int m) {
		if(m == 0) return 1;
		if(m == 1) return n;
		int ans = n;
		if(m%2 == 0) {
			int tmp = pow(ans,m/2);
			ans = tmp*tmp;
		}else {
			int tmp = pow(ans,--m);
			ans = n*tmp;
		}
		return ans;
	}
 	static void pf(int n) {
 		int cnt;
 		int l = n;
 		for(int i=2;i*i<=l;i++) {
 			cnt = 0;
 			while(n>1 && n%i == 0) {
 				cnt++;
 				n/=i;
 			}
 			if(cnt > 0)
 			{
 				max = Math.max(max, i);
 				primefactors.put(i, Math.max(cnt,primefactors.getOrDefault(i, 0)));
 			}
 		}
 		if(n>1)
 		{
 			primefactors.put(n, Math.max(1, primefactors.getOrDefault(n, 0)));
 			max = Math.max(n, max);
 		}
 	}
}
