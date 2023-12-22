import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int dfs(int p, int q, int a, int n, int cur_pro, int prev_d){
		if(n < 0){
			return 0;
		}
		
		if(p == 0 && cur_pro <= a){
			return 1;
		}else if(n == 0){
			return 0;
		}
		
		int sum = 0;
		
		int divide = /* a */ a / cur_pro + 1;
		while(p * divide >= q){
			//System.out.println("[" + n +"]" + " 1 / " + divide);
			if(divide * cur_pro > a){
				divide--;
				continue;
			}else if(n * q < p * divide){
				divide--;
				continue;
			}else if(divide < prev_d){
				break;
			}
			
			final int upper = p * divide - q;
			final int downer = q * divide;
			
			sum += dfs(upper, downer, a, n - 1, cur_pro * divide, divide);
			
			divide--;
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			StringTokenizer tok = new StringTokenizer(br.readLine());
			final int p = Integer.parseInt(tok.nextToken());
			final int q = Integer.parseInt(tok.nextToken());
			final int a = Integer.parseInt(tok.nextToken());
			final int n = Integer.parseInt(tok.nextToken());
			
			if(p == 0 && q == 0 && a == 0 && n == 0){
				break;
			}
			
			int sum = dfs(p, q, a, n, 1, 0);
			
			System.out.println(sum);
		}
		
	}

}