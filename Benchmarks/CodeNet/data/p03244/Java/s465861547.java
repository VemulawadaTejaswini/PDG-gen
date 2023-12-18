import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007L;
	public static String[] Ws = null;
	public static int wsIndx = 0;
	public static BufferedReader in = null;
	public static ArrayList<int[]> list = new ArrayList<>();
	public static void main(String[] args) throws Exception {

		int n = nextInt();
		int[] v = nextInts();

		HashMap<Integer,Pair> oddMap = new HashMap<>();
		HashMap<Integer,Pair> evenMap = new HashMap<>();

		Pair p ;
		for(int i=0;i<n;i++){
			if(i%2==0){
				p = evenMap.getOrDefault(v[i], new Pair(v[i],0));
				p.V++;
				evenMap.put(v[i], p);
			}else{
				p = oddMap.getOrDefault(v[i], new Pair(v[i],0));
				p.V++;
				oddMap.put(v[i], p);
			}
		}
		Pair[] oddA = new Pair[oddMap.size()];
		Pair[] evenA = new Pair[evenMap.size()];

		int i=0;
		for(Pair x:oddMap.values()){
			oddA[i]=x;
			i++;
		}
		i=0;
		for(Pair x:evenMap.values()){
			evenA[i]=x;
			i++;
		}
		Arrays.sort(evenA,Pair.getComparator());
		Arrays.sort(oddA,Pair.getComparator());

		long ans =0;
		long tmpE;
		long tmpO;


		if(evenA[0].N != oddA[0].N){
			tmpE = n-(evenA[0].V+oddA[0].V);
			tmpO = tmpE+1;
		}else{
			int[] e =new int[2];
			int[] o =new int[2];
			e[0]=evenA[0].V;
			o[0]=oddA[0].V;

			if(e[0]!=n/2){
				e[1]=evenA[1].V;
			}else{
				e[1]=0;
			}
			if(o[0]!=n/2){
				o[1]=oddA[1].V;
			}else{
				o[0]=0;
			}
			tmpE=n-(e[0]+o[1]);
			tmpO=n-(o[0]+e[1]);

		}
		ans=Math.min(tmpE, tmpO);
		System.out.println(ans);


	}

	public static class Pair {
		int N;
		int V;


		Pair(int N, int V) {
			this.N = N;
			this.V = V;
		}

		public int getN() {
			return N;
		}

		public int getV() {
			return V;
		}

		public static Comparator<Pair> getComparator() {
			return Comparator.comparing(Pair::getV ,Comparator.reverseOrder());
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

	public static String concatStringArray(String[] s){
		StringBuffer sb = new StringBuffer();
		for(String x:s){
			sb.append(x);
		}
		return sb.toString();
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