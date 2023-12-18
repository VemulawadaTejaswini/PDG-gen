import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String[] sa ;
	static int N; 
	static int Q ;
	static int[]a ;
	static int[]b ;
	static int[]p ;
	static int[]x ;
	static int counter; 
	static int[] tyoutencount;
	static int[] tyoutenXcount; 
	static boolean[] tyoutenserch; 
	static int[][]edge; 
	static List<List<Integer>> list;
	
		
	public static void main(String[]args) throws Exception{
		 sa = br.readLine().split(" ");
		 N = Integer.parseInt(sa[0]);
		 Q = Integer.parseInt(sa[1]);
		a = new int[N];
		b = new int[N];
		p = new int[N+1];
		x = new int[N+1];
		counter = 0;
		tyoutencount = new int[N+1];
		tyoutenXcount = new int[N+1];
		tyoutenserch = new boolean[N+1];
		edge = new int[N+1][N+1];//余分に作っておく
		list = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			list.add(new ArrayList<>());
		}
		System.out.println();
		
		for(int i = 1;i<N;i++) {//ちょっと工夫1~N-1個
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]);
			b[i] = Integer.parseInt(sa[1]);
			edge[a[i]][b[i]] = 1;//N-1こ分の変数
			list.get(a[i]-1).add(b[i]);
			list.get(b[i]-1).add(a[i]);
		}	
		for(int i = 1;i<Q+1;i++) {//1~QのNこ
			sa = br.readLine().split(" ");
			p[i] = Integer.parseInt(sa[0]);
			x[i] = Integer.parseInt(sa[1]);
			tyoutenXcount[p[i]]+=x[i];
		}
		br.close();
		
		DFS(1);
	
		for(int i = 1;i<=N;i++) {
			System.out.println(tyoutencount[i]);
		}
		
	}
	private static void DFS(int n) {
		counter+=tyoutenXcount[n];
		tyoutencount[n] +=counter;
		tyoutenserch[n] = true;
		for (int next : list.get(n-1)) {
			if (tyoutenserch[next]==false) {
				DFS(next);
			}
		}
		
		counter-=tyoutenXcount[n];	
	}
}
