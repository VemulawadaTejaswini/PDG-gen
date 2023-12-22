import java.util.*;
public class Main{
	public void solve(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int S = sc.nextInt();
			while(N + K + S == 0) break;
			
			int ans = 0;
			for(int i = 0; i < (1 << N); i++){
				if(Integer.bitCount(i) == K){
					int sum = 0;
					for(int j = 0; j < N; j++){
						if((i & (1 << j)) != 0){
							sum += (j + 1);
						}
					}
					if(sum == S) ans++;
				}
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args){
		new Main().solve();
	}
}