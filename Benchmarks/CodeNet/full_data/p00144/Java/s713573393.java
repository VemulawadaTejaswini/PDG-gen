import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	ArrayList<LinkedList<Integer>> adjacent;
	Scanner sc;
	
	class Pair{
		int first;
		int second;
		Pair(int e1,int e2){
			first=e1;second=e2;
		}
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	String bfs(int dep,int dest,int TTL,int n){
		LinkedList<Pair> que=new LinkedList<Pair>();
		que.addLast(new Pair(dep,1));

		boolean[] visited=new boolean[n];
		Arrays.fill(visited,false);
		visited[dep]=true;
		
		while(!que.isEmpty()){
			Pair node=que.pollFirst();
			if(node.first==dest)return Integer.toString(node.second);
				
			if(++node.second<=TTL){
				for(int next :adjacent.get(node.first)){
					if(!visited[next]){
						que.addLast(new Pair(next,node.second));
						visited[next]=true;
					}
				}
			}
		}
		return "NA";
	}

	void io(){
		sc=new Scanner(System.in);
		
		int n=ni();
		adjacent=new ArrayList<LinkedList<Integer>>();

		for(int i=0;i<n;++i){
			int r=ni(), k=ni();
			for(int j=0;j<k;++j){
				adjacent.add(new LinkedList<Integer>());
				adjacent.get(r-1).add(ni()-1);
			}
		}
		//debug(adjacent);
		
		int m=ni();
		for(int i=0;i<m;++i){
			int dep=ni()-1,dest=ni()-1,TTL=ni();
			System.out.println(bfs(dep,dest,TTL,n));
		}
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
		
	}

}