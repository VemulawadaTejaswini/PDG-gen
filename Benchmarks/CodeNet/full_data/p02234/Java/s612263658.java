import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	final static int N = 100;
	final static int INF = 100000;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] m = new int[n + 1][n + 1];
		int[] p = new int[n + 1];
		int i = 0, j = 0, r = 0;
		
		
		for(i = 1; i <= n; i++){
			String[] str = br.readLine().split(" ");
			p[i - 1] = Integer.parseInt(str[0]);
			p[i] = Integer.parseInt(str[1]);
		}
		
		for(int l = 2; l <= n ; l++){
			for(i = 1; i <= n - l + 1; i++){
				j = i + l - 1;
				m[i][j] = INF;
				for(int k = i; k < j; k++){
					r = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];
					//System.out.println(m[i][k] + "+" + m[k + 1][j] + "+" + p[i - 1] + "*" + p[k] + "*" + p[j]);
					if(m[i][j] > r) m[i][j] = r;
				}
			}
		}
		
		System.out.println(m[i - 1][j]);
	}
}