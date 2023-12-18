import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static boolean[][] r;
	public static void main(String[] args){
		int N = in.nextInt(), M  = in.nextInt();
		r = new boolean[N][N];
		
		for(int i = 0; i < N; i++){
			Arrays.fill(r[i], false);
		}
		
		for(int i = 0; i < M; i++){
			int a = in.nextInt() - 1, b = in.nextInt() - 1;
			r[a][b] = true;
			r[b][a] = true;
		}
		
		boolean[] v = new boolean[N];
		Arrays.fill(v, false);
		System.out.println(route(0,  v));
	}
	
	public static int route(int p, boolean[] v){
		v[p] = true;
		
		boolean all = true;
		for(int i = 0; i < v.length; i++){
			if(!v[i]) all = false;
		}
		if(all){
			return 1;
		}
		
		int sum = 0;
		for(int i = 0; i < v.length; i++){
			if(!v[i] && r[p][i]){
				boolean[] nv = new boolean[v.length];
				for(int j = 0; j < v.length; j++){
					nv[j] = v[j];
				}
				sum += route(i, nv);
			}
		}
		return sum;
	}
}