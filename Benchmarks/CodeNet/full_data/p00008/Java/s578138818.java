import java.util.*;
public class Main {
	static int N;
	static int bfs(int sum,int n){
		if(n==4&&sum==N)return 1;
		else if(n==4&&sum!=N)return 0;
		int cnt = 0;
		for(int i=0;i<=9;i++)if(sum+i<=N)cnt+=bfs(sum+i,n+1);
		return cnt;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			N = in.nextInt();
			System.out.println(bfs(0,0));
		}
	}
}