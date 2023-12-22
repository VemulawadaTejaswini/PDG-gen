import java.io.*;
import java.util.*;
import java.util.regex.*;


public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solutionC(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solutionA(String[] args) throws Exception{
		int H1=nextInt();
		int M1=nextInt();
		int H2=nextInt();
		int M2=nextInt();
		int K=nextInt();

		int t1=H1*60+M1;
		int t2=H2*60+M2;

		pw.println(t2-t1-K);
	}
	public static void solutionB(String[] args) throws Exception{
		pw.println(nextString().replaceAll("\\?","D"));
	}
	public static void solutionC(String[] args) throws Exception{
		int N=nextInt();
		int[] A = new int[N+2];
		for(int i=1;i<=N+1;i++) {
			A[i]=nextInt();
		}
		long sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
		}
		long ans=1;
		//葉ではないノードの数
		long[] s = new long[N+2];
		s[0]=1;

		for(int i=1;i<=N;i++) {
			long tmp = s[i-1]-A[i];
			sum-=A[i];
			if(tmp<=0) {
				pw.println(-1);
				return;
			}
			//残りの葉の数
			long sub=sum-tmp;
			//この階層で何個ノードを作っても矛盾しないか（2倍以内）
			if(sub<0) {
				pw.println(-1);
				return;
			}else {
				tmp=Math.min(tmp*2, tmp+sub);
			}
			s[i]=tmp;
			ans+=tmp;
		}
		pw.println(ans);
	}
	public static void solutionD(String[] args) throws Exception{


	}



	public static void check() throws Exception{
		if(in == null){
			in = new BufferedReader(new InputStreamReader(System.in));
		}
		if(Ws==null || Ws.length<=wsIndx){
			Ws = in.readLine().split(" ");
			wsIndx=0;
		}
	}
	public static int nextInt()throws Exception{
		check();
		return Integer.parseInt(Ws[wsIndx++]);
	}

	public static long nextLong()throws Exception{
		check();
		return Long.parseLong(Ws[wsIndx++]);
	}

	public static String nextString()throws Exception{
		check();
		return Ws[wsIndx++];
	}

	public static int[] nextInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nextLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nextStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}

}

