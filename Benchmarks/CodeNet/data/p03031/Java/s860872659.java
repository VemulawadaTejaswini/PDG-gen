import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<Integer> cc = new ArrayList<>(N);
	//Collections.sort(list);
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	static int INF=1000000007;
	
	static int N,M,Ks[],Ps[];
	static boolean Ss[][];
	static int ctn=0;
	static int check(boolean v[]) {
		for(int i=0;i<M;i++) {
			int t=0;
			for(int a=0;a<N;a++) {
				if(Ss[i][a]&&v[a]) {
					t++;
				}
			}
			if(t%2!=Ps[i])return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];for(int i=0;i<N;i++) {}
		//Ae2+Be2=Ce2
		//StringBuffer str = new StringBuffer(hoge1);
		//for(int i=0;i<N;i++) {}
		N=sc.nextInt();
		M=sc.nextInt();
		
		Ks=new int[M];
		Ps=new int[M];
		Ss=new boolean[M][N];
		
		
		for(int i=0;i<M;i++) {
			Ks[i]=sc.nextInt();
			for(int a=0;a<Ks[i];a++) {
				Ss[i][sc.nextInt()-1]=true;
			}
		}
		for(int i=0;i<M;i++) {
			Ps[i]=sc.nextInt();
		}
		boolean v[]=new boolean[N];
		Arrays.fill(v, false);
		dfs(0,v);
		p(ctn);
	}
	
	static int dfs(int i,boolean v[]) {
		if(i==N) {
			ctn+=check(v.clone());
			return 1;
		}
		dfs(i+1,v.clone());
		v[i]=true;
		dfs(i+1,v.clone());
		
		return 1;
		
	}
	
	
		
	
	public static long modPow(long g,long N) {
		long T=1;
		for(int i=0;i<N;i++) {
			T*=g;
			T%=mod;
		}
		return T;
	}
	
	public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
	}
	
	public static long gcd(long a, long b) {
        return b == 0 ? a: gcd(b, a % b);
	}
	static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;
		
		
		
		int minPos=-1;
		char min =Character.MAX_VALUE;
		
		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}
		
		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));
		
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
