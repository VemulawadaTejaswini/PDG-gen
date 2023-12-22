import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, s;
		while((string = reader.readLine()) != null){
			n = Integer.valueOf(string.split(" ")[0]);
			s = Integer.valueOf(string.split(" ")[1]);
			
			int res[][] = new int[s + 1][n + 1];
			for(int i = 9; i >= 0; i--){
				for(int j = 0; j <= s; j++){
					if(i <= j && res[i][0] <= n){
						res[j][n] = res[j - i][n - res[j][0]]++;
					}
				}
			}
			System.out.println(res[s][n]);
		}
		reader.close();
	}
}