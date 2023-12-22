import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=Integer.parseInt(in.next()),W=Integer.parseInt(in.next());
		List<mono> A=new ArrayList<>();
		
		int sum=0;
		for(int i=0;i<N;i++) {
			mono m=new mono();
			m.v=Integer.parseInt(in.next());m.w=Integer.parseInt(in.next());
			A.add(m);
		}
		
		int DP[][]=new int[N+1][W+1];
		
		for(int i=0;i<N;i++) {
			mono m=A.get(i);
			for(int j=0;j+m.w<=W;j++) {
				DP[i+1][j]=Math.max(DP[i+1][j], DP[i][j]);
				DP[i+1][j+m.w]=Math.max(DP[i+1][j+m.w], DP[i][j]+m.v);
			}
		}
		
		int res=-1;
		for(int i=0;i<=W;i++)res=Math.max(res, DP[N][i]);
		
		System.out.println(res);
	}

}

class mono{
	int v=0,w=0;
}

