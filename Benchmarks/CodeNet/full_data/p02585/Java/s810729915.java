import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args)throws Exception{
		PrintWriter out = new PrintWriter(System.out);
		int N=nextInt();
		long K=nextInt();
		int P[]=new int[N];
		long C[]=new long[N];
		long ans=(long)Math.pow(-10,18)*-1-3,U=K;
		for(int i=0;i<N;i++){
			P[i]=nextInt()-1;
		}
		for(int i=0;i<N;i++){
			C[i]=nextInt();
		}
		for(int i=0;i<N;i++){
			long sum[]=new long[N];
			boolean visit[]=new boolean[N];
			int now=i;
			K=U;
			for(int j=0;j<N+1;j++){
				if(visit[now]==false){
					visit[now]=true;
					if(j!=0)
						sum[j]=C[P[now]]+sum[j-1];
					else
						sum[j]=C[P[now]];
					now=P[now];
				}
				else{
					if(j>K)
						for(int k=0;k<K;k++){
							if(ans<sum[k])
								ans=sum[k];
						}
					else{
						if(sum[j-1]<=0){
							for(int k=0;k<N;k++){
								if(ans<sum[k])
									ans=sum[k];
							}
							break;
						}
						long max=0;
						long cnt=j;
						if(K%cnt==0){
							cnt=K/cnt-1;
						}
						else{
							cnt=K/cnt;
						}
						max+=cnt*sum[j-1];
						K-=cnt*j;
						long m=sum[0];
						for(int k=1;k<K;k++){
							if(m<sum[k])
								m=sum[k];
						}
						if(ans<max+m)
							ans=max+m;
					}
					break;
				}
			}
		}
		System.out.println(ans);
	}
	public static long lmod(long i, long j) {
	     return (i%j)<0?(i%j)+0+(j<0?-j:j):(i%j+0);
	 }
	static boolean isOK(int index,int key,int[]a){
		if (a[index]>=key) return true;
	    else return false;
	}
	static int binary_search(int key,int[] a) {
	    int ng = -1; //「index = 0」が条件を満たすこともあるので、初期値は -1
	    int ok = (int)a.length; // 「index = a.size()-1」が条件を満たさないこともあるので、初期値は a.size()
	    while (Math.abs(ok - ng) > 1) {
	        int mid = (ok + ng) / 2;
	        if (isOK(mid,key,a)) ok = mid;
	        else ng = mid;
	    }
	    return ok;
	}
	//FastScanner
	static InputStream in = System.in;
	static  byte[] buffer = new byte[1024];
	static int length = 0, p = 0;
	public static boolean hasNextByte () {
		if (p < length) return true;
		else {
			p = 0;
			try {length = in.read(buffer);}
			catch (Exception e) {e.printStackTrace();}
			if (length == 0) return false;
		}
		return true;
	}
	public static int readByte () {
		if (hasNextByte() == true) return buffer[p++];
		return -1;
	}
	public static boolean isPrintable (int n) {return 33<=n&&n<=126;}
	public static void skip () {
		while (hasNextByte() && !isPrintable(buffer[p])) p++;
	}
	public static boolean hasNext () {skip(); return hasNextByte();}
	public static String next () {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int temp = readByte();
		while (isPrintable(temp)) {
			sb.appendCodePoint(temp);
			temp = readByte();
		}
		return sb.toString();
	}
	public static int nextInt () {return Math.toIntExact(nextLong());}
	public static int[] nextInts (int n) {
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = nextInt();
		return ar;
	}
	public static long nextLong () {
		if (!hasNext()) throw new NoSuchElementException();
		boolean minus = false;
		int temp = readByte();
		if (temp == '-') {
			minus = true;
			temp = readByte();
		}
		if (temp<'0' || '9'<temp) throw new NumberFormatException();
		long n = 0;
		while (isPrintable(temp)) {
			if ('0'<=temp && temp<='9') {
				n *= 10;
				n += temp - '0';
			}
			temp = readByte();
		}
		return minus? -n : n;
	}
}

