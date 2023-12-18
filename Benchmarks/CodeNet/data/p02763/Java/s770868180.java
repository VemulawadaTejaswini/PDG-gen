import java.util.*;

public class Main {
	static class StringRangeQuery {
		int N;
		boolean[][] v;
		char[] str;
		
		public StringRangeQuery(String s) {
			str = s.toCharArray();
			N=1;
			while(N<s.length())
				N<<=1;
			v = new boolean[26][N*2-1];
			for(int i=0; i<s.length(); i++)
				set(str[i], i, true);
		}
		
		public void set(char c, int i, boolean on) {
			i+=N-1;
			v[c-'a'][i] = on;
			while(i>0) {
				i = (i-1)/2;
				v[c-'a'][i] = v[c-'a'][i*2+1] | v[c-'a'][i*2+2];
			}
		}
		
		//maximum value in range [a, b)
		public long countCharcterType(int a, int b) {
			int ans = 0;
			for(int i=0; i<26; i++)
				if(contain(a, b, 0, 0, N, i))
					ans++;
			return ans;
		}
		public boolean contain(int a, int b, int k, int l, int r, int c) {
			if(a<=l && r<=b) {
				return v[c][k];
			} else if(r<=a || b<=l) {
				return false;
			} else {
				return contain(a, b, k*2+1, l, (l+r)/2, c) | contain(a, b, k*2+2, (l+r)/2, r, c);
			}
		}
		
		public void set(int i, char c) {
			if(str[i]==c)
				return;
			set(c, i, true);
			set(str[i], i, false);
			str[i] = c;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		int Q = sc.nextInt();
		StringRangeQuery srq = new StringRangeQuery(S);
		
		for(int i=0; i<Q; i++) {
			int type = sc.nextInt();
			if(type==1) {
				int idx = sc.nextInt()-1;
				char c = sc.next().toCharArray()[0];
				srq.set(idx, c);
			} else {
				int l = sc.nextInt()-1;
				int r = sc.nextInt();
				System.out.println(srq.countCharcterType(l, r));
			}
		}
		
		sc.close();
	}

}

