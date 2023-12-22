import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, q, T, cnt, ans = 0;
		int[] S = new int[10001];
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			S[i] = sc.nextInt();
		}
		
		q = sc.nextInt();
		for(int i = 0; i < q; i++){
			T = sc.nextInt();
			S[n] = T;
			
			cnt = 0;
			while(S[cnt] != T){
				cnt ++;
			}
			
			if(cnt < n){
				ans ++;
			}
		}
		
		System.out.println(ans);
	}
}