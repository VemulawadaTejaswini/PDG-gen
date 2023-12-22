import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int w, n, c, time = 0;
		
		while(!(string = reader.readLine()).equals("0")){
			w = Integer.valueOf(string);
			n = Integer.valueOf(reader.readLine());
			c = 0;
			int value[] = new int[n];
			int weiht[] = new int[n];
			int brionac[][] = new int[1001][10001];
			for(int i = 0; i < n; i++){
				string = reader.readLine();
				value[i] = Integer.valueOf(string.split(",")[0]);
				weiht[i] = Integer.valueOf(string.split(",")[1]);
			}
			for(int i = n - 1; i >= 0; i--){
				for(int j = 0; j <= w; j++){
					if(j < weiht[i]){
						brionac[i][j] = brionac[i + 1][j];
					}
					else{
						if(brionac[i + 1][j] >= brionac[i + 1][j - weiht[i]] + value[i]){
							brionac[i][j] = brionac[i + 1][j];
							c = j - 1;
						}else{
							brionac[i][j] = brionac[i + 1][j - weiht[i]] + value[i];
							c = j - weiht[i] - 1;
						}
					}
				}
			}
			System.out.println("Case " + ++time + ":\n" + brionac[0][w] + "\n" + c);
		}
		reader.close();
	}
}