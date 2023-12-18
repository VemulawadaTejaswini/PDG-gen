import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		int M = Integer.parseInt(in.next());
		boolean[] x = new boolean[N];
		boolean[] y = new boolean[N];
		int tmpa,tmpb;
		for(int i = 0; i<M; i++)x[i] = false;
		for(int i = 0; i<M; i++){
			tmpa=Integer.parseInt(in.next());
			tmpb=Integer.parseInt(in.next());
			if(tmpa==1)x[tmpb]=true;
			if(tmpb==1)x[tmpa]=true;
			if(tmpa==N)y[tmpb]=true;
			if(tmpb==N)y[tmpa]=true;
		}

		String ans = "IMPOSSIBLE";
		for(int i = 0;i<N;i++){
			if(x[i]&&y[i]){
				ans="POSSIBLE";
				break;
			}
		}
		System.out.println(ans);
	}
}