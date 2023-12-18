import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int[] atai=new int[N];
		int tmp=root(N);
		int block=tmp;
		tmp=(N+tmp-1)/tmp;
		int[] SQRT=new int[tmp];
		Arrays.fill(atai, 0);
		Arrays.fill(SQRT, 0);
		for(int i=0; i<N; i++) {
			int A=sc.nextInt();
			addQuery(A,i,block,atai,SQRT);
		}
		int max=0;
		for(int i=0; i<N; i++) {
			if(i==0) {
				int ans=gcdQuery(1,N-1,block,atai,SQRT);
				if(ans>max) {
					max=ans;
				}
			}
			else if(i==N-1) {
				int ans=gcdQuery(0,N-2,block,atai,SQRT);
				if(ans>max) {
					max=ans;
				}
			}
			else {
				int ans=gcd(gcdQuery(0,i-1,block,atai,SQRT),gcdQuery(i+1,N-1,block,atai,SQRT));
				if(ans>max) {
					max=ans;
				}
			}
		}
		pl(max);
	}
	static void addQuery(int num,int place,int cluster_size,int[] raw,int[] square) {
		//0オリジン
		raw[place]=num;
		square[place/cluster_size]=gcd(square[place/cluster_size],num);
	}
	static int gcdQuery(int left,int right,int cluster_size,int[] raw,int[] square) {
		//始点、終点、平方分割したときの一般的な大きさ（10なら3など）、それぞれの区間の値、平方分割した、領域の和　[始点,終点]
		//始点、終点は0オリジン
		left--;
		int tmpsum=0;
		int counter=left;
		while(true) {
			counter++;
			if(counter==right) {
				tmpsum=gcd(tmpsum,raw[counter]);
				break;
			}
			else if(counter%cluster_size==0) {
				if(counter+cluster_size-1>right) {
					tmpsum=gcd(tmpsum,raw[counter]);
				}
				else if(counter+cluster_size-1<=right){
				}
				break;
			}
			else {
				tmpsum=gcd(tmpsum,raw[counter]);
			}
		}
		if(counter<right) {
			int ryouiki=counter/cluster_size;
			while(true) {
				if((ryouiki+1)*cluster_size-1<=right) {
					tmpsum=gcd(tmpsum,square[ryouiki]);
					ryouiki++;
					counter=(ryouiki)*cluster_size-1;
				}
				else if((ryouiki+1)*cluster_size>right) {
					break;
				}
			}
		}
		if(counter<right) {
			while(true) {
				counter++;
				if(counter==right) {
					tmpsum=gcd(tmpsum,raw[counter]);
					break;
				}
				else {
					tmpsum=gcd(tmpsum,raw[counter]);
				}
			}
		}
		return tmpsum;
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static int root(int a) {
		int ketasu=0;
		int tmp=a;
		while(tmp>0) {
			ketasu++;
			tmp/=10;
		}
		int constant=(ketasu+1)/2;  //よく使うので定数化
		if(ketasu>=1) {
			int[] suuji=new int[constant];
			tmp=a;
			for(int i=0; i<constant; i++) {
				suuji[constant-1-i]=a%100;
				a/=100;
			}
			int ans=0;
			int kai=0;
			int mae=0;
			if(constant<=1) {
				for(int i=10; i>=0; i--) {
					if(suuji[0]>=i*i) {
						return i;
					}
				}
			}
			else {
				for(int i=0; i<constant; i++) {
					mae+=kai*2;
					for(int j=9; j>=0; j--) {
						if((mae*10+j)*j<=suuji[i]) {
							ans=ans*10+j;
							mae*=10;
							kai=j;
							if(i+1<constant) {
								suuji[i+1]+=(suuji[i]-(mae+j)*j)*100;
							}
							break;
						}
					}
				}
			}
			return ans;
		}
		else {
			return 0;
		}
	}
	private static int gcd(int m, int n) {
		if(n==0 || m==0) {
			return Math.max(n, m);
		}
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
			return gcd(n, m % n);
		}
}