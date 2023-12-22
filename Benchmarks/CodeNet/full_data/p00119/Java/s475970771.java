import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	ArrayList<LinkedList<Integer>> adjacent;
	boolean[] visited;
	
	int ni(){
		return sc.nextInt();
	}
	
		void dfs(int x){
		for(int y:adjacent.get(x)){
			if(!visited[y]){
				visited[y]=true;
				dfs(y);
			}
		}
		System.out.println(x);
	}
	
	void io(){
		sc=new Scanner(System.in);
		
		int m=ni(), n=ni();
		
		adjacent=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<=m;++i){
			adjacent.add(new LinkedList<Integer>());
		}
		
		int last=0;
		
		for(int i=0;i<n;++i){
			int x=ni(), y=ni();
			//y->xの枝を張る (yはxより後, 根に行くほど後)
			adjacent.get(y).add(x);
			
			//最後に這入った奴は分かっている
			if(last==0||last==x) last=y;
		}
		visited=new boolean[m+1];
		
		dfs(last);
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}