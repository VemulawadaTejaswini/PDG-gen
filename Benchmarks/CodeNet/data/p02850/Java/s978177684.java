import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[]=new int[N];
		int b[]=new int[N];
		int k[]=new int[N];
		int ans[][]=new int[N][N];
		boolean visited[]=new boolean[N];
		int ori=0,max=0;
		ArrayList<ArrayList<Integer>> tree=new ArrayList<ArrayList<Integer>>();
		Deque<Integer> G=new ArrayDeque<Integer>();
		Deque<Integer> C=new ArrayDeque<Integer>(); 
		for(int i=0;i<N;i++){
			tree.add(new ArrayList<Integer>());
		}
		for(int i=0;i<N-1;i++){
			a[i]=stdIn.nextInt()-1;
			b[i]=stdIn.nextInt()-1;
			ArrayList<Integer> c=new ArrayList<Integer>();
			c=tree.get(a[i]);c.add(b[i]);tree.set(a[i],c);
			c=tree.get(b[i]);c.add(a[i]);tree.set(b[i],c);
			k[a[i]]++;k[b[i]]++;
		}
		for(int i=0;i<N;i++){
			if(k[i]==1){
				ori=k[i];break;
			}
		}
		G.add(ori);C.add(N);visited[ori]=true;
		while(G.size()>0){
			int A=G.poll();
			int c=C.poll();
			int color=0;
			for(int i=0;i<tree.get(A).size();i++){
				if(visited[tree.get(A).get(i)]==false){
					if(color==c)
						color++;
					if(max<color)
						max=color;
					G.add(tree.get(A).get(i));C.add(color);
					ans[A][tree.get(A).get(i)]=color;
					visited[tree.get(A).get(i)]=true;
					color++;
				}
			}
		}
		System.out.println(max+1);
		for(int i=0;i<N-1;i++){
			System.out.println(ans[a[i]][b[i]]+1);
		}
	}
}
