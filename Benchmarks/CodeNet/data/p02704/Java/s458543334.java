import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{
	static void main() throws Exception{
		int n=sc.nextInt();
		int[][]op=new int[][] {sc.intArr(n),sc.intArr(n)};
		BigInteger[]masks=new BigInteger[64];
		masks[0]=new BigInteger("1");
		for(int i=1;i<64;i++) {
			masks[i]=masks[i-1].multiply(new BigInteger("2"));
		}
		long[][][]vals=new long[2][n][64];
		for(int i=0;i<2;i++) {
			for(int j=0;j<n;j++) {
				BigInteger cur=new BigInteger(sc.next());
				BigInteger zero=new BigInteger("0");
				for(int bit=0;bit<64;bit++) {
					if(!((cur.and(masks[bit])).equals(zero))) {
						vals[i][j][bit]=1;
					}
				}
			}
		}
		long[][][]ans=new long[n][n][64];
		for(int bit=0;bit<64;bit++) {
			for(int row=0;row<n;row++) {
				//and of row is 1
				if(op[0][row]==0 && vals[0][row][bit]!=0) {
					for(int j=0;j<n;j++) {
						ans[row][j][bit]=1;
					}
				}
			}
			for(int col=0;col<n;col++) {
				//and of col is 1
				if(op[1][col]==0 && (vals[1][col][bit])!=0) {
					for(int j=0;j<n;j++) {
						ans[j][col][bit]=1;
					}
				}
			}
		}
		
		for(int bit=0;bit<64;bit++) {
			for(int row=0;row<n;row++) {
				//or of row is 0
				if(op[0][row]==1 && (vals[0][row][bit])==0) {
					for(int j=0;j<n;j++) {
						if((ans[row][j][bit])!=0){
							pw.println(-1);
							return;
						}
					}
				}
			}
			for(int col=0;col<n;col++) {
				//or of col is 0
				if(op[1][col]==1 && (vals[1][col][bit])==0) {
					for(int j=0;j<n;j++) {
						if((ans[j][col][bit])!=0){
							pw.println(-1);
							return;
						}
					}
				}
			}
		}
		int[][][]cntZeros=new int[2][n][64];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int bit=0;bit<64;bit++) {
					cntZeros[0][i][bit]+=(ans[i][j][bit])==0?1:0;
					cntZeros[1][j][bit]+=(ans[i][j][bit])==0?1:0;
				}
			}
		}
		//fill cells with row with or=1 and col with or=1 with ones
		for(int bit=0;bit<64;bit++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(op[0][i]==1 && (vals[0][i][bit])!=0 && op[1][j]==1 && (vals[1][j][bit])!=0) {
						ans[i][j][bit]=1;
					}
				}
			}
		}
		
		
		//or is 1
		for(int bit=0;bit<64;bit++) {
			o:for(int row=0;row<n;row++) {
				if(op[0][row]==1 && (vals[0][row][bit])!=0) {
					for(int j=0;j<n;j++) {
						if((ans[row][j][bit])!=0) {
							continue o;
						}
					}
					
					
					//find column with and = 0 and has more than one zero
					int col=-1;
					for(int j=0;j<n;j++) {
						if(op[1][j]==0 && (vals[1][j][bit])==0 && cntZeros[1][j][bit]>1) {
							col=j;
							break;
						}
					}
					if(col==-1) {
						pw.println(-1);
						return;
					}
					cntZeros[1][col][bit]--;
					ans[row][col][bit]=1;
				}
			}
			o:for(int col=0;col<n;col++) {
				if(op[1][col]==1 && (vals[1][col][bit])!=0) {
					for(int j=0;j<n;j++) {
						if((ans[j][col][bit])!=0) {
							continue o;
						}
					}
					
					
					//find row with and = 0 and has more than one zero 
					int row=-1;
					for(int j=0;j<n;j++) {
						if(op[0][j]==0 && (vals[0][j][bit])==0 && cntZeros[0][j][bit]>1) {
							row=j;
							break;
						}
					}
					if(row==-1) {
						pw.println(-1);
						return;
					}
					cntZeros[0][row][bit]--;
					ans[row][col][bit]=1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				BigInteger cur=new BigInteger("0");
				for(int bit=0;bit<64;bit++) {
					if(ans[i][j][bit]==0)continue;
					cur=cur.or(masks[bit]);
				}
				pw.print(cur+" ");
			}
			pw.println();
		}
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
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public long[] longArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
		}
		public int[] intSortedArr(int n) throws IOException {
	        int[]inArr=new int[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public long[] longSortedArr(int n) throws IOException {
	        long[]inArr=new long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        shuffle(inArr);
	        Arrays.sort(inArr);
	        return inArr;
		}
		public Integer[] IntegerArr(int n) throws IOException {
	        Integer[]inArr=new Integer[n];for(int i=0;i<n;i++)inArr[i]=nextInt();
	        return inArr;
		}
		public Long[] LongArr(int n) throws IOException {
	        Long[]inArr=new Long[n];for(int i=0;i<n;i++)inArr[i]=nextLong();
	        return inArr;
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
	static void shuffle(int[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			int tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(long[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			long tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
	static void shuffle(String[]inArr) {
		for(int i=0;i<inArr.length;i++) {
			int idx=i+(int)(Math.random()*(inArr.length-i));
			String tmp=inArr[i];
			inArr[i]=inArr[idx];
			inArr[idx]=tmp;
		}
	}
}