import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int P[] = new int[N];

		int bck = 0;
		for(int n=0;n<N;n++){
			P[n] = sc.nextInt();
		}

		
		for(int n=0;n<N;n++){
			int ans = 0;
			int bef = 0;
			for(int t=0;t<N;t++){
				if(n==t) continue;
				
				ans += Math.abs(P[t]-bef);
				bef = P[t];
			}
			ans += Math.abs(bef);
			System.out.println(ans);
		}
	}
}