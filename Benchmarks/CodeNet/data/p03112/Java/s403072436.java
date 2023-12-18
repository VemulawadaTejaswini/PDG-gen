import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int Q = sc.nextInt();
		long s[] = new long[A+2];
		long t[] = new long[B+2];
		long x[] = new long[Q];
		
		//工夫
		s[0]=(long)-1e10;
		t[0]=(long)-1e10;
		s[A+1]=Long.MAX_VALUE;
		t[B+1]=Long.MAX_VALUE;
		
		for(int i=0;i<A;i++) {
			s[i+1]=sc.nextLong();
		}
		for(int i=0;i<B;i++) {
			t[i+1]=sc.nextLong();
		}
		for(int i=0;i<Q;i++) {
			x[i]=sc.nextLong();
		}
		sc.close();
		
		//sort
		Arrays.sort(s);
		Arrays.sort(t);
		
		StringBuilder sb = new StringBuilder();
		
		//xについてループ
		for(int i=0;i<Q;i++) {
			long X = x[i];
			
			long ans = Long.MAX_VALUE;
			for(int k=0;k<2;k++) {
				//神社から見ていく場合
				if(k==0&i!=0) {
					long tmp[] = s;
					s = t;
					t = tmp;
				}//寺から見ていく場合
				else {
					long tmp[] = s;
					s = t;
					t = tmp;
				}
				
				int l = binarySearch(s,X);
				int r = l+1;
				
				//左に行く場合と、右にいく場合
				long dst = 0;

				long Y = 0;
				int l2 = 0;
				int r2 = 0;
				for(int j=0;j<2;j++) {
					if(j==0) {
						//左に行く場合
						if(l==0)continue;
						dst = X-s[l];
						Y = s[l];
					}else {
						//右に行く場合
						if(r==s.length-1)continue;
						dst = s[r]-X;
						Y = s[r];
					}
					l2 = binarySearch(t,Y);
					r2 = l2 + 1;
					dst += Math.min(Y-t[l2], t[r2]-Y);
					ans = Math.min(ans, dst);
				}
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb.toString());
	}
	
	
	//lを返すので、rはl+1で求める。
	static int binarySearch(long v[], long X) {
		int l = -1;
		int r = v.length;
		while(r>l+1) {
			int c = (l+r)/2;
			if(X > v[c]) l=c;
			else r=c;
		}
		return l;
	}
	
}
