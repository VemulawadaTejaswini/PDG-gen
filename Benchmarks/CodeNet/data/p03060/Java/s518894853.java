import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DFS dfs=new DFS();

		dfs.abc125_B();

	}
}

class DFS{

	int N;
	int[] Value;
	int[] Cost;

	public void abc125_B(){

		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();

		Value=new int[N];
		Cost=new int[N];

		for(int i=0;i<N;i++)	Value[i]=sc.nextInt();

		for(int i=0;i<N;i++)	Cost[i]=sc.nextInt();

		int ans=DFS_do(0,0,0);

		System.out.println(ans);

		sc.close();
	}

	public int DFS_do(int n,int value,int cost) {

		if(n==this.N) return value-cost;

		int ret0=DFS_do(n+1,value,cost);
		int ret1=DFS_do(n+1,value+Value[n],cost+Cost[n]);

		return Math.max(ret0, ret1);

	}

}
