import java.io.*;
import java.math.*;
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
		String s = nextString();
		pw.println(s.substring(0,3));

	}
	public static void solutionB(String[] args) throws Exception{
		long A = nextLong();
		long V = nextLong();
		long B = nextLong();
		long W = nextLong();
		long T = nextLong();

		long dist=Math.abs(A-B);
		long a = V-W;

		if(A==B||a*T >=dist) {
			pw.println("YES");
		}else {
			pw.println("NO");
		}
	}
	public static void solutionC(String[] args) throws Exception{
		int N=nextInt();
		int K=nextInt();
		int[] A = nextInts();
		int[] B = new int[N];
		int roopEnd=Math.min(K,String.valueOf(N).length()*8);

		int[] tmp = new int[N];
		for(int i=0;i<N;i++) {
			int st = Math.max(0,i-A[i]);
			int end = Math.min(N-1,i+A[i]);
			for(int d=st;d<=end;d++) {
				tmp[d]++;
			}
		}
		for(int i=0;i<N;i++) {
			B[i]=A[i];
		}
		A=tmp;


		for(int k=1;k<roopEnd;k++) {
			tmp = new int[N];
			for(int i=0;i<N;i++) {
				int dif=A[i]-B[i];
				int oldDif=Math.abs(B[i]-i);
				for(int d=0;d<=dif;d++) {
					if(oldDif+d <=N-1) {
						tmp[oldDif+d]++;
					}
					if(d!=0&&0<=oldDif-d) {
						tmp[oldDif-d]++;
					}
				}
			}
			for(int i=0;i<N;i++) {
				B[i]=A[i];
				A[i]=Math.min(N,A[i]+tmp[i]);
			}
			print(A);
		}
		print(A);
	}
	public static void solutionD(String[] args) throws Exception{
	}
	public static void solutionE(String[] args) throws Exception{
	}

	public static void print(int[] x) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<x.length;i++) {
			sb.append(x[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		pw.println(sb.toString());
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

