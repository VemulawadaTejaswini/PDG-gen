import java.util.*;


public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int N = sc.nextInt();
			int Q = sc.nextInt();
			if((N|Q)==0) break;
			Unionfind uf = new Unionfind(N);
			for(int i=2;i<=N;i++){
				uf.parent[i] = sc.nextInt();
			}
			int ans=0;
			for(int mm =0;mm<Q;mm++){
				String operation = sc.next();
				if(operation.equals("Q")){
					ans += uf.find(sc.nextInt());
				}else{
					//operationがMのとき
					uf.mark[sc.nextInt()] = true;
				}
			}
			System.out.println(ans);
		}
	}
}
class Unionfind{
	public int parent[];
	public boolean mark[];

	Unionfind(int n){
		parent = new int[n+1];
		mark = new boolean[n+1];
		mark[1] = true;
		parent[1] = 1;
	}

	//木の根を求める
	public int find(int x){
		if(mark[x]){
			return  x;
		}else{
			return x = find(parent[x]);
		}
	}
}

/*//xとyの属する属性の併合
		static void unite(int x, int y){
			x = find(x);//xの親ノードが属性だから
			y = find(y);
			if(x==y){
				//OK
			}else{
				if(rank[x]<rank[y]){
					parent[x] = y;
				}else{
					parent[y] = x;
					if(rank[x]==rank[y]){
						rank[x]++;
					}
				}
			}
		}

		//xとyが同じ属性に属するかどうか
		static boolean isSame(int x,int y){
			return find(x)==find(y);
		}*/