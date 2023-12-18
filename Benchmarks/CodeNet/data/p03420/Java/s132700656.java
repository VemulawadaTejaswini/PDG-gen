import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), K = sc.nextInt();
		
		long ans = 0;
		
		for(int i=K+1;i<=N;i++){
			
			int cnt = i-K;
			ans += cnt * (N/i);
			
			ans +=  Math.max(0, (N - N/i*i)-K+1);
		}
		if(K==0)
			ans -= N;
		
		System.out.println(ans);
	}
	
	
}
