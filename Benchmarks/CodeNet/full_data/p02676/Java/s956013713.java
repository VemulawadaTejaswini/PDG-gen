import java.io.*;
import java.util.*;

import javax.lang.model.element.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static long cnt=0;
	public static PrintWriter pw = new PrintWriter(System.out);
	public static void main(String[] args) throws Exception {
		solutionB(args);
		if(in!=null){
			in.close();
		}
		pw.flush();
		pw.close();
	}

	public static void solutionA(String[] args) throws Exception{

		int N = nextInt();
		N=N%10;
		if(N==2||N==4||N==5||N==7||N==9){
			pw.println("hon");
		}else if(N==0||N==1||N==6||N==8){
			pw.println("pon");
		}else{
			pw.println("bon");
		}


	}
	public static void solutionB(String[] args) throws Exception{

		int K=nextInt();
		String S = nextString();
		if(S.length()<=K){
			pw.println(S);
		}else{
			pw.println(S.substring(0,K)+"...");
		}


	}
public static class Pair {
	String N;
	int V;

	Pair(String N, int V) {
		this.N = N;
		this.V = V;
	}

	public String getN() {
		return N;
	}

	public int getV() {
		return V;
	}

	public static Comparator<Pair> getComparator() {
		return Comparator.comparing(Pair::getN).thenComparing(Pair::getV, Comparator.reverseOrder());
	}
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

