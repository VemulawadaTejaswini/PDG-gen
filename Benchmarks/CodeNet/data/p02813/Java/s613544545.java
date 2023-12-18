import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static void main(String[] args) throws Exception {

		int N = nextInt();
		int[] P =nextInts();
		int[] Q =nextInts();

		ArrayList<String> list = new ArrayList<>();
		String s = "";
		for(int i=1;i<=N;i++){
			s+=String.valueOf(i);
		}
		C(s,"",list);
		String p="";
		for(int i=0;i<N;i++){
			p+=String.valueOf(P[i]);
		}
		String q="";
		for(int i=0;i<N;i++){
			q+=String.valueOf(Q[i]);
		}

		int pi=0,qi=0;
		String x;
		for(int i=0;i<list.size();i++){
			x=list.get(i);
			if(x.equals(p)){
				pi=i+1;
			}
			if(x.equals(q)){
				qi=i+1;
			}
		}
		System.out.println(Math.abs(pi-qi));
	}

	public static void C(String remain,String ans,ArrayList<String> list){
		if(remain.length()==0){
			list.add(ans);
		}
		for(int i=0;i<remain.length();i++){
			C(remain.substring(0,i)+remain.substring(i+1,remain.length()),ans+remain.substring(i,i+1),list);
		}
	}


	public static boolean isExpN(long a,int base){
		int x=1;
		while((int)Math.pow(x, 2) <= a){
			if((int)Math.pow(x, 2) == a){
				return true;
			}
			x*=base;
		}
		return false;
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
