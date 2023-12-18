import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int q = sc.nextInt();
		long[][] alpha = new long[26][s.length()];
		Segment[] seg = new Segment[26];
		for (int i = 0; i < n; i++) alpha[s.charAt(i)-'a'][i]++;
		for (int i = 0; i < 26; i++) seg[i] = new Segment(alpha[i]);
		int t,b,c,l,r,count;
		char[] S = s.toCharArray();
		for (int i = 0; i < q; i++) {
			t = sc.nextInt();
			if(t==1) {
				b = sc.nextInt()-1;
				c = sc.next().charAt(0)-'a';
				if(S[b]-'a'!=c) {
					seg[S[b]-'a'].update(b, 0);
					seg[c].update(b, 1);
					S[b] = (char)(c+'a');
				}
			}else if(t==2) {
				l = sc.nextInt()-1;
				r = sc.nextInt();
				count = 0;
				for (int j = 0; j < 26; j++) {
					if(seg[j].query(l,r)>0) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
	public static class Segment {
		int n; long[] dat; int e = 0;
		public Segment(long[] a){
			n = 1;
			while(n < a.length) n *= 2;
			dat = new long[(n<<1)-1];
			for (int i = 0; i < n; i++) dat[i+n-1] = (i<a.length)?a[i]:e;
			for (int i = n-2; i >= 0; i--) dat[i] = dat[(i<<1)+1] + dat[(i<<1)+2];
		}
		public void update(int k, long a){
			k += n-1;
			long b = dat[k];
			dat[k] = a;
			while(k>0) {
				k = (k-1)/2;
				dat[k] += a-b;
			}
		}
		private long query(int a, int b, int k, int l, int r) {
			if(r<=a||b<=l) return 0;
			if(a<=l&&r<=b) return dat[k];
			else {
				long vl = query(a,b,(k<<1)+1,l,(l+r)/2);
				long vr = query(a,b,(k<<1)+2,(l+r)/2,r);
				return vl+vr;
			}
		}
		public long query(int a, int b) {
			return query(a,b,0,0,n);
		}
		public long query() {
			return query(0,n,0,0,n);
		}
	}
}