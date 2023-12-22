import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		StringBuilder sb = new StringBuilder();
		int n = 0, m = 0, a = 0, b = 0, c = 0;
		
		while(!(sb.append(reader.readLine())).equals("0")){
			n = Integer.valueOf(sb.toString());
			m = Integer.valueOf(reader.readLine());
			
			int map[][] = new int[n][n];
			boolean visit[] = new boolean[n];
			for(int i = 0;i < n; i++) Arrays.fill(map[i], 1 << 29);
			for(int i = 0; i < m; i++){
				sb.setLength(0);
				sb.append(reader.readLine());
				a = Integer.valueOf(sb.toString().split(",")[0]);
				b = Integer.valueOf(sb.toString().split(",")[1]);
				c = (Integer.valueOf(sb.toString().split(",")[2]) - 100) / 100;
				map[a][b] = map[b][a] = c;
			}
			c = 0;
			visit[0] = true;
			for(int x = 0; x < n - 1; x++){
				m = 1 << 29;
				for(int i = 0; i < n; i++){
					if(map[0][i] < m && !visit[i]){
						m = map[0][i];
						b = i;
					}
				}
				visit[b] = true;
				c += map[0][b];
				for(int i = 0; i < n; i++){
					map[0][i] = Math.min(map[0][i], map[b][i]);
				}
			}
			System.out.println(c);
		}
		reader.close();
	}
}