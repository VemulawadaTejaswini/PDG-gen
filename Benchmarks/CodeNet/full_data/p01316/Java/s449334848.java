import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
		while(sc.hasNext()){
			n = sc.nextInt();
			m = sc.nextInt();
			if(n == 0 && m == 0)break;
			else calc(n, m);
			
		}
	}
	public void calc(int n, int m){
		code = new int[m];
		xs = new int[n+1];
		 memo = new int[n+1][256];
		 for(int i = 0; i < n+1; i++){
			 Arrays.fill(memo[i], Integer.MAX_VALUE); 
		 }
		for(int i = 0; i < m; i++){
			code[i] = sc.nextInt();
		}
		for(int i = 1; i < n+1; i++){
			xs[i] = sc.nextInt();
		}
		
		memo[0][128] = 0;
		for(int i = 1; i < n+1; i++){
			for(int y = 0; y < 256; y++){
				if(memo[i-1][y] != Integer.MAX_VALUE){
					for(int j = 0; j < m; j++){
						int t = y + code[j];
						if(t > 256) t = 255;
						if(t < 0) t = 0;
						int me1= memo[i][t];
						int me2 = memo[i-1][y] + (xs[i] - t) * (xs[i] - t);
						memo[i][t] = Math.min(me1, me2);
					}
				}
			}
		}
		int ans = Integer.MAX_VALUE;
		for(int y = 0; y < 256; y++){
			ans = Math.min(ans, memo[n][y]);
		}
		System.out.println(ans);
		
	}
	int n;
	int m;
	int[] code;
	int[] xs;
	int[][] memo;
	
	/*public int iter(int y, int i){
		if(i >= n) 
			return 0;
		else if(memo[i][y] != Integer.MAX_VALUE) 
			return memo[i][y];
		else{
			for(int j = 0; j < m; j++){
				int t = y + code[j];
				if(t > 255) t = 255;
				if(t < 0) t = 0;
				memo[i][y] = Math.min(memo[i][y], (xs[i] - t)*(xs[i] - t) + iter(t, i+1));
			}
			return memo[i][y];
		}
	}*/
	
	public static void main(String[] args) {
		new Main().run();
	}
}