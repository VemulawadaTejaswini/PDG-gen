import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	final double INF = 5000.;
	
	String solve(final int s, final int e, final double[][] map, final int n){
		boolean[] used = new boolean[n];
		double d[] = new double[n];
		Arrays.fill(d, INF);
		d[s] = 0;
		ArrayList<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();
		for(int i=0; i<n; ++i){
			LinkedList<Integer> l = new LinkedList<Integer>();
			l.add(s);
			list.add(l);
		}
		
		while(true){
			int u=-1;
			for(int v=0; v<n; ++v){
				if(!used[v] && (u==-1 || d[v] < d[u])){
					u=v;
				}
			}
			if(u==-1)break;
			used[u] = true;
			for(int v=0; v<n; ++v){
				if(d[v] > d[u] + map[u][v] && map[u][v] <= 50){
					d[v] = d[u] + map[u][v];
					@SuppressWarnings("unchecked")
					LinkedList<Integer> l = (LinkedList<Integer>) list.get(u).clone();
					l.add(v);
					list.set(v, l);
				}
			}
		}
		
		return d[e]==INF ? "NA" : listToString(list.get(e));
	}
	
	String listToString(final LinkedList<Integer> list){
		String str = new String();
		for(int i=0; i<list.size(); ++i){
			str += list.get(i)+1;
			if(i+1<list.size()) str += " ";
		}
		
		return str;
	}
	
	void io(){
		Scanner sc = new Scanner(System.in);
		while(true){
			final int n = sc.nextInt();
			if(n==0)break;
			int b_info[][] = new int[n][2];
			double[][] map = new double[n][n];
			
			for(int i=0; i<n; ++i){
				final int b=sc.nextInt()-1;
				final int x=sc.nextInt();  final int y = sc.nextInt();
				b_info[b][0] = x;
				b_info[b][1] = y;
			}
			
			for(int i=0; i<n; ++i){
				for(int j=0; j<n; ++j){
					final double dis = Math.sqrt(
						Math.pow(b_info[i][0]-b_info[j][0], 2)
						+ Math.pow(b_info[i][1]-b_info[j][1], 2)
					);
					map[i][j] = dis;
				}
			}
			
			final int m = sc.nextInt();
			for(int i=0; i<m; ++i){
				final int s = sc.nextInt()-1;
				final int g = sc.nextInt()-1;
				System.out.println(solve(s, g, map, n));
			}
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}

}