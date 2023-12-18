import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		int H = nextInt();
		int W = nextInt();
		String[][] s = new String[H+2][W+2];
		Arrays.fill(s[0], ".");
		Arrays.fill(s[s.length-1], ".");
		for(int i=1;i<s.length-1;i++){
			s[i]=toStringArray("."+nextString()+".");

		}
		String ans = "Yes";
		//4方向の場合は0～5,8方向は0～9でループ
		int[] around = { -1, 0, 1, 0, -1, 1, 1, -1, -1 };
		for(int i=1;i<s.length-1;i++){
			for(int k=1;k<s[i].length-1;k++){
				if("#".equals(s[i][k])){
					boolean flg = false;
					for(int n=0;n<=4;n++){
						if("#".equals(s[i+around[n]][k+around[n+1]])){
							flg=true;
							break;
						}
					}
					if(!flg){
						ans ="No";
						System.out.println(ans);
						return;

					}
				}
			}
		}

		System.out.println(ans);
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
