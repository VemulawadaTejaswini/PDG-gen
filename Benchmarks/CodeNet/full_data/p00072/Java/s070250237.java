import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	final int INF=1<<30;
	int adjacent[][];
	Scanner sc;
	int n;
	
	int solve(){
		int cost=0;
		Set<Integer> vertex=new HashSet<Integer>();
		vertex.add(0);
		
		for(int h=0;h<n;++h){
			int min=INF,e=0;
			for(int v:vertex){
				for(int i=0;i<n;++i){
					if(vertex.contains(i))continue;
					if(adjacent[v][i]<min){
						min=adjacent[v][i];
						e=i;
					}			
				}
			}
			if(min<INF){
				vertex.add(e);
				cost+=min/100-1;	
			}
		}
		return cost;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in).useDelimiter("\\s*,\\s*|\r\n");
		
		while((n=ni())!=0){
			adjacent=new int[n][n];
			for(int i=0;i<n;++i){Arrays.fill(adjacent[i],INF);}
			int m=ni();
			for(int i=0;i<m;++i){
				int a=ni(),b=ni(),d=ni();
				adjacent[a][b]=adjacent[b][a]=d;
			}
			System.out.println(solve());
		}
	}

	public static void main(String[] args) {
			new Main().io();
	}
}