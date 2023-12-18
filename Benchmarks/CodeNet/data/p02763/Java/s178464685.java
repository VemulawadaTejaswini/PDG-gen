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
		int t,b,c,l,r;
		for (int i = 0; i < q; i++) {
			t = sc.nextInt();
			if(t==1) {
				b = sc.nextInt();
				c = sc.next().charAt(0)-'a';
				seg[c].update(b, 1);
			}else if(t==2) {
				l = sc.nextInt();
				r = sc.nextInt();
				int count = 0;
				for (int j = 0; j < 26; j++) {
					if(seg[j].query(l,r+1)>0) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
	public static class Segment {
		int n; long[] dat;
		public Segment(long[] a){
			n = 1;
			while(n < a.length) n *= 2;
			dat = new long[2*n-1];
			for (int i = 0; i < n; i++) dat[i+n-1] = (i<a.length)?a[i]:0;
			for (int i = n-2; i >= 0; i--) dat[i] = dat[2*i+1] + dat[2*i+2];
		}
		void update(int k, long a){
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
				long vl = query(a,b,2*k+1,l,(l+r)/2);
				long vr = query(1,b,2*k+2,(l+r)/2,r);
				return vl+vr;
			}
		}
		public long query(int a, int b) {
			return query(a,b,0,0,n);
		}
	}
}