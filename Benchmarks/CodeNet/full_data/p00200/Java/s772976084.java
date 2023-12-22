
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	int n,m,k;
	Node node[];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}
	
	void run(){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		node=new Node[n];
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int cost=sc.nextInt();
			int time=sc.nextInt();
			node[i]=new Node();
			node[a-1]._add(b,cost,time);
		}
		k=sc.nextInt();
		for(int i=0;i<k;i++){
			int p=sc.nextInt();
			int q=sc.nextInt();
			int r=sc.nextInt();
			solve(p,q,r);
			for(int j=0;j<node.length;j++){
				node[j].done=false;
				node[j].minCost=-1;
				node[j].from=-1;
			}
		}
		
	}
	
	void solve(int p,int q,int r){
		p--;
		q--;
		node[p].minCost=0;
		if(r==0){
			while(true){
				int min=-1,j=0;
				for(int i=0;i<node[p].to.size();i++){
					node[p].done=true;
					int to=node[p].to.get(i)-1;
					if(node[to].done)continue;
					int cost=node[p].cost.get(i)+node[p].minCost;
					if(min==-1){
						min=cost;
					}
					if(min>=cost){
						min=cost;
						j=to;
					}
					if(node[to].minCost==-1){
						node[to].minCost=cost;
					}
					if(node[to].minCost>=cost){
						node[to].minCost=cost;
						node[to].from=p;
					}
				}
				p=j;
				if(p==q){
					System.out.println(node[q].minCost);
					break;
				}
			}
		}else{
			while(true){
				int min=-1,j=0;
				for(int i=0;i<node[p].to.size();i++){
					node[p].done=true;
					int to=node[p].to.get(i)-1;
					if(node[to].done)continue;
					int cost=node[p].time.get(i)+node[p].minCost;
					if(min==-1){
						min=cost;
					}
					if(min>=cost){
						min=cost;
						j=to;
					}
					if(node[to].minCost==-1){
						node[to].minCost=cost;
					}
					if(node[to].minCost>=cost){
						node[to].minCost=cost;
						node[to].from=p;
					}
				}
				p=j;
				if(p==q){
					System.out.println(node[q].minCost);
					break;
				}
			}
		}
	}
	
	class Node{
		ArrayList<Integer> to=new ArrayList<Integer>();
		ArrayList<Integer> cost=new ArrayList<Integer>();
		ArrayList<Integer> time=new ArrayList<Integer>();
		
		boolean done=false;
		int minCost=-1;
		int from=-1;
		
		void _add(Integer kto,Integer kco,Integer kti){
			to.add(kto);
			cost.add(kco);
			time.add(kti);
		}
	}
}