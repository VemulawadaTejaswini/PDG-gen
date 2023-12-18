import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	static HashMap<Integer, Integer> primefactors;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
		long ans = 0;
		for(int e:a) {
			int t = e;
			int cnt;long tmp = 1;
			for(int i=2;i*i<=10e6;i++) {
				cnt = 0;
				while(t>1 && t%i == 0) {
	 				cnt++;
	 				t/=i;
	 			}
 				tmp= (long) ((tmp*pow(i,primefactors.getOrDefault(i,0)-cnt))% (1e9 + 7));
			}
			ans = (long) ((ans + tmp) % (1e9 + 7));
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
 				primefactors.put(i, Math.max(cnt,primefactors.getOrDefault(i, 0)));
 		}
 		if(n>1)
 			primefactors.put(n, Math.max(1, primefactors.getOrDefault(n, 0)));
 	}
}
