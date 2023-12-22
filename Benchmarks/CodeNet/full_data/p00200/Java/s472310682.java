import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String str[];
		int n, m, a, b;
		int cost[][] = new int[100][100];
		int time[][] = new int[100][100];
		
		while(true){
			str = reader.readLine().split(" ");
			n = Integer.valueOf(str[0]);
			m = Integer.valueOf(str[1]);
			if(n == 0 && m == 0) break;
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					cost[i][j] = time[i][j] = 1000 * 1000;
				}
			}
			for(int i = 0; i < n; i++){
				str = reader.readLine().split(" ");
				a = Integer.valueOf(str[0]) - 1;
				b = Integer.valueOf(str[1]) - 1;
				cost[a][b] = cost[b][a] = Integer.valueOf(str[2]);
				time[a][b] = time[b][a] = Integer.valueOf(str[3]);
			}
			for(int i = 0; i < m; i++){
				for(int j = 0; j < m; j++){
					for(int k = 0; k < m; k++){
						cost[j][k] = Math.min(cost[j][k], cost[j][i] + cost[i][k]);
						time[j][k] = Math.min(time[j][k], time[j][i] + time[i][k]);
					}
				}
			}
			n = Integer.valueOf(reader.readLine());
			for(int i = 0; i < n; i++){
				str = reader.readLine().split(" ");
				a = Integer.valueOf(str[0]) - 1;
				b = Integer.valueOf(str[1]) - 1;
				switch(Integer.valueOf(str[2])){
				case 0 : System.out.println(cost[b][a]); break;
				case 1 : System.out.println(time[b][a]);
				}
			}
		}
		reader.close();
	}
}