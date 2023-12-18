import java.util.Scanner;
public class Main {
	static int N=0;
	static double rx[]=new double[N];
	static double ry[]=new double[N];
	static boolean visited[]=new boolean[N];
	static int num=0;
	static int ori=0,key=0;
	static double ans=0;
	static double cout=0;
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		N=stdIn.nextInt();
		rx=new double[N];
		ry=new double[N];
		visited=new boolean[N];
		for(int i=0;i<N;i++){
			int X=stdIn.nextInt();
			int Y=stdIn.nextInt();
			rx[i]=X;ry[i]=Y;
		}
		for(int i=0;i<N;i++){
			ori=i;num=0;visited=new boolean[N];cout=0;
			dfs(i,0,0);
		}
		num=1;
		for(int i=1;i<=N;i++){
			num*=i;
		}
		System.out.println(ans/num);
	}
	static void dfs(int now,double x,double y){
		visited[now]=true;
		num++;
		if(now!=ori)
			cout+=Math.sqrt(Math.pow(rx[now]-x,2)+Math.pow(ry[now]-y,2));
		if(num==N){
			ans+=cout;
			cout=0;
		}
		for(int i=0;i<N;i++){
			if(visited[i]==false)dfs(i,rx[now],ry[now]);
		}
		visited[now]=false;
		num--;
	}
}
