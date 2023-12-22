import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	Scanner sc;
	
	class Pair<T1,T2>{
		T1 first;
		T2 second;
		Pair(T1 a,T2 b){
			this.first=a;
			this.second=b;
		}
	}
	
	void debug(Object...os){
		System.err.println(Arrays.deepToString(os));
	}
	
	int swap(int puzzle,int a,int b){
		int p=puzzle&7<<(a*3),q=puzzle&7<<(b*3);
		puzzle^=p|q;
		p>>>=a*3;q>>>=b*3;
		puzzle|=p<<(b*3)|q<<(a*3);
		return puzzle;
	}
	
	int solve(int puzzle){
		HashSet<Integer> visited=new HashSet<Integer>();
		LinkedList<Pair<Integer,Integer>> queue=new LinkedList<Pair<Integer,Integer>>();
		queue.addLast(new Pair<Integer,Integer>(puzzle,0));
		visited.add(puzzle);
		
		while(!queue.isEmpty()){
			Pair<Integer,Integer> p=queue.poll();
			
			if(p.first==076543210)return p.second;
			
			int pos=0;
			//0の位置を探す
			for(int i=0;i<8;++i){
				if((p.first&7<<(i*3))==0){
					pos=i;
				}
			}
			int temp;
			//縦
			temp=swap(p.first,pos,(pos+4)%8);
			if(!visited.contains(temp)){
				queue.addLast(new Pair<Integer,Integer>(temp,p.second+1));
				visited.add(temp);
			}
			//右
			if(pos%4!=3){
				temp=swap(p.first,pos,pos+1);
				if(!visited.contains(temp)){
					queue.addLast(new Pair<Integer,Integer>(temp,p.second+1));
					visited.add(temp);
				}
			}
			//左
			if(pos%4!=0){
				temp=swap(p.first,pos,pos-1);
				if(!visited.contains(temp)){
					queue.addLast(new Pair<Integer,Integer>(temp,p.second+1));
					visited.add(temp);
				}
			}
		}
		return -1;
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		while(sc.hasNext()){
			int puzzle=0;
			for(int i=0;i<8;++i){
				int n=ni();
				puzzle|=n<<(i*3);
			}
			System.out.println(solve(puzzle));
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}