import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {


		String s = nextString();
		int[] o = {0,0};
		int[] e = {0,0};

		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='0'){
				if(i%2==0){
					e[0]++;
				}else{
					o[0]++;
				}
			}else{
				if(i%2==0){
					e[1]++;
				}else{
					o[1]++;
				}
			}
		}
		int ans =0;
		if(o[0]>=o[1]){
			if(o[0]>=e[0]){
				ans=e[0]+o[1];
			}else{
				ans=o[0]+e[1];
			}
		}else{
			if(o[1]>=e[1]){
				ans=e[1]+o[0];
			}else{
				ans=o[1]+e[0];
			}
		}
		System.out.println(ans);

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
