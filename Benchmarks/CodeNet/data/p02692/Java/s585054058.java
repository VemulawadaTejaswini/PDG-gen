import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N=nextInt();
		int A=nextInt();
		int B=nextInt();
		int C=nextInt();
		int[][] dp = new int[N+10][3];
		dp[0][0]=0;
		dp[0][1]=0;
		dp[0][2]=0;

		int ACnt = 0;
		int BCnt = 0;
		int CCnt = 0;
		int MAX=Math.max(Math.max(A,B),C);


		String[] S = new String[N];
		for(int i=0;i<N;i++){
			S[i] = nextString();
			if("AC".equals(S[i])){
				ACnt++;
				CCnt++;
			}else if("BC".equals(S[i])){
				BCnt++;
				CCnt++;

			}else{
				ACnt++;
				BCnt++;
			}
		}

		String[] w = new String[N];
		for(int i=0;i<N;i++){
			if("AC".equals(S[i])){
				if(A>C){
					A--;
					C++;
					ACnt--;
					CCnt--;
					w[i]="C";
				}else{
					A++;
					C--;
					ACnt--;
					CCnt--;
					w[i]="A";
				}
			}else if("BC".equals(S[i])){
				if(B>C){
					B--;
					C++;
					BCnt--;
					CCnt--;
					w[i]="C";
				}else{
					B++;
					C--;
					BCnt--;
					CCnt--;
					w[i]="B";
				}

			}else{
				if(A>B){
					A--;
					B++;
					ACnt--;
					BCnt--;
					w[i]="B";
				}else{
					A++;
					B--;
					ACnt--;
					BCnt--;
					w[i]="A";
				}
			}

		}
		if(A<0||B<0||C<0){
			System.out.println("No");
			return;
		}else{
			System.out.println("Yes");
			for(int i=0;i<N;i++){
				System.out.println(w[i]);
			}
		}

	}
	public static String[] toStringArray(String s) {
		String[] tmp = new String[s.length()];
		char[] c = s.toCharArray();
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = String.valueOf(c[i]);
		}
		return tmp;
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
