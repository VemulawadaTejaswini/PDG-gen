import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		DFS2 dfs=new DFS2();

		dfs.abc125_C();

	}

}

class DFS2{

	int N;
	int[] box;

	public void abc125_C() {

		Scanner sc=new Scanner(System.in);

		N=sc.nextInt();

		box=new int[N];

		for(int i=0;i<N;i++) box[i]=sc.nextInt();

		System.out.println(DFS_do(0,0));

		sc.close();

	}

	public int DFS_do(int n,int x) {

		if(n==N) return x;

		int ret0=DFS_do(n+1,gcd(n+1,x,0));

		int ret1=DFS_do(n+1,gcd(n+1,box[n],x));

		//System.out.println(ret0+" "+ret1);

		return Math.max(ret0,ret1);

	}

	public int gcd(int n,int a,int b) {

		if(n==N && b==0) return 1;
		if(b==0) return a;

		int result = a;
		int k = 0;
		int na = b;
		do {
			k = result % na;
			result = na;
			na = k;
		} while(k != 0);
		return result;
	}



}
