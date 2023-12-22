import java.io.*;
import java.util.*;
public class Main{
	static int mod=(int)1e9+7;
    static long fastpow(long n,long ti) {
		 if (ti == 0) 
		        return 1l;
		if(ti%2==0) {
			long y=fastpow(n, ti/2);
			long k=y*y;
			k%=mod;
			return k;
		}
		else {
			long y=fastpow(n, ti/2);
			long k=((n*y)%mod)*y;
			k%=mod;
			return k;
		}
	}
    static long modInverse(long x) {
    	return fastpow(x, mod-2);
    }
	static void main() throws Exception{
		int n=sc.nextInt(),k=sc.nextInt();
		ArrayList<Integer>pos=new ArrayList<>(),neg=new ArrayList<Integer>();
		boolean zero=false;
		for(int i=0;i<n;i++) {
			int x=sc.nextInt();
			if(x==0) {
				zero=true;
				continue;
			}
			if(x>0) {
				pos.add(x);
			}
			else {
				neg.add(-x);
			}
		}
		Collections.sort(pos);
		Collections.sort(neg);
		long ans=1;
		int i=pos.size()-1,j=neg.size()-1,taken=0,takenNeg=0;
		while((i>=0 || j>=0) && taken<k) {
			if(i<0) {
				takenNeg++;
				taken++;
				ans=(ans*neg.get(j--))%mod;
				continue;
			}
			if(j<0) {
				taken++;
				ans=(ans*pos.get(i--))%mod;
				continue;
			}
			if(pos.get(i)>=neg.get(j)) {
				taken++;
				ans=(ans*pos.get(i--))%mod;
				continue;
			}
			takenNeg++;
			taken++;
			ans=(ans*neg.get(j--))%mod;
		}
		if(taken<k) {
			pw.println(0);
			return;
		}
		if((takenNeg&1)==0) {
			pw.println(ans);
			return;
		}
		if(pos.size()==0) {
			if(zero) {
				pw.println(0);
				return;
			}
			ans=-1+mod;
			for(int idx=0;idx<k;idx++) {
				ans=(ans*neg.get(idx))%mod;
			}
			pw.println(ans);
			return;
		}
		long notTakenPos=-1,takenNegative=-1,takenPos=-1,notTakenNeg=-1;
		if(i>=0) {
			notTakenPos=pos.get(i);takenNegative=neg.get(j+1);
		}
		
		if(i+1<pos.size() && j>=0) {
			takenPos=pos.get(i+1);notTakenNeg=neg.get(j);
		}
		if(notTakenPos==-1 && takenPos==-1) {
			if(zero) {
				pw.println(0);
				return;
			}
			ans=-1+mod;
			for(int idx=0;idx<k;idx++) {
				ans=(ans*neg.get(idx))%mod;
			}
			pw.println(ans);
			return;
		}
		if(notTakenPos==-1) {
			ans=(ans*notTakenNeg)%mod;
			ans=(ans*modInverse(takenPos))%mod;
			pw.println(ans);
			return;
		}
		if(takenPos==-1) {
			ans=(ans*notTakenPos)%mod;
			ans=(ans*modInverse(takenNegative))%mod;
			pw.println(ans);
			return;
		}
		if(notTakenPos*takenNegative>=notTakenNeg*takenPos) {
			ans=(ans*notTakenPos)%mod;
			ans=(ans*modInverse(takenNegative))%mod;
			pw.println(ans);
			return;
		}
		ans=(ans*notTakenNeg)%mod;
		ans=(ans*modInverse(takenPos))%mod;
		pw.println(ans);
	}
	public static void main(String[] args) throws Exception{
		sc=new MScanner(System.in);
		pw = new PrintWriter(System.out);
		int tc=1;
//		tc=sc.nextInt();
		while(tc-->0)
			main();
		pw.flush();
	}
	static PrintWriter pw;
	static MScanner  sc;
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] intArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] longArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        shuffle(in);
	        Arrays.sort(in);
	        return in;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
	static void shuffle(int[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			int tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
	static void shuffle(long[]in) {
		for(int i=0;i<in.length;i++) {
			int idx=(int)(Math.random()*in.length);
			long tmp=in[i];
			in[i]=in[idx];
			in[idx]=tmp;
		}
	}
}