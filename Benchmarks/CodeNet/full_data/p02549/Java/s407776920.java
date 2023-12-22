import java.util.*;
public class Main {
	static int N;
	static int K;
	
	static int[]S;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc= new Scanner(System.in);
		N= sc.nextInt();
		K= sc.nextInt();
		
		S= new int[N+1];
		
		Arrays.fill(S, -1);
		
		for(int i=0;i<K;i++){
			int l= sc.nextInt();
			int r= sc.nextInt();
			
			for(int j= l;j<=r;j++)S[j]= 1;
			
		}
		
		sc.close();
		
		
		int ans= solve(1,1,0);
		
		System.out.println(ans);
		
		
	}
	static int solve(int i,int d,int cnt){
		if( i == N) return kaijou(cnt);
		if(i > N)return 0;
		
		int nextd= next(d);
		
		int res1= solve(i+ nextd, nextd, cnt++);
		int res2= solve(i, d, cnt);
		
		return res1+ res2;

	}
	
	static int next(int d){
		int res= d+1;
		
		while(res < N){
			if(S[res] == 1)return res;
			res++;
		}
		return N;
	}
	
	static int kaijou(int n){
		int res= 1;
		
		for(int i=n;i>0;i--)res *= n;
		
		return res;
		
	}

}
