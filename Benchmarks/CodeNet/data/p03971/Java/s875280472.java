import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		int A = nextInt();
		int B = nextInt();
		String S = nextString();

		int a=0,b=0;
		int ac=0;
		for(int i=0;i<N;i++){
			if(S.charAt(i)=='a'){
				a++;
				if(ac <A+B ){
					System.out.println("Yes");
					ac++;
				}else{
					System.out.println("No");
				}
			}else if(S.charAt(i)=='b'){
				b++;
				if(ac <A+B && b<=B){
					System.out.println("Yes");
					ac++;
				}else{
					System.out.println("No");
				}
			}else{
				System.out.println("No");
			}
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

	public static int[] nestInts()throws Exception{
		check();
		int[] tmp = new int[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Integer.parseInt(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static long[] nestLongs()throws Exception{
		check();
		long[] tmp = new long[Ws.length];
		for(int i=0;i<tmp.length;i++){
			tmp[i]=Long.parseLong(Ws[i]);
		}
		wsIndx=Ws.length;
		return tmp;
	}

	public static String[] nestStrings()throws Exception{
		check();
		wsIndx=Ws.length;
		return Ws;
	}


}
