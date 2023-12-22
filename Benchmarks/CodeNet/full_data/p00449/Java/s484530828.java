import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, k, a, b, c;
		boolean judge = false;
		
		while(!(string = reader.readLine()).equals("0 0")){
			n = Integer.valueOf(string.split(" ")[0]);
			k = Integer.valueOf(string.split(" ")[1]);
			
			int map[][] = new int[n][n];
			int mna[][] = new int[n][n];
			for(int i = 0; i < n; i++) Arrays.fill(map[i], 1 << 29);
			for(int i = 0; i < k; i++){
				string = reader.readLine();
				if(string.split(" ")[0].equals("1")){
					if(!judge) judge = true;
					a = Integer.valueOf(string.split(" ")[1]) - 1;
					b = Integer.valueOf(string.split(" ")[2]) - 1;
					c = Integer.valueOf(string.split(" ")[3]);
					map[a][b] = map[b][a] = Math.min(map[a][b], c);
				}else{
					if(judge){
						judge = false;
						for(int q = 0; q < n; q++){
							for(int w = 0; w < n; w++){
								mna[q][w] = map[q][w];
							}
						}
						for(int q = 0; q < n; q++){
							for(int w = 0; w < n; w++){
								for(int e = 0; e < n; e++){
									mna[w][e] = Math.min(mna[w][e], mna[w][q] + mna[q][e]);
								}
							}
						}
					}
					a = Integer.valueOf(string.split(" ")[1]) - 1;
					b = Integer.valueOf(string.split(" ")[2]) - 1;
					if(mna[a][b] == 1 << 29){
						System.out.println(-1);
					}else{
						System.out.println(mna[a][b]);
					}
				}
			}
		}
		reader.close();
	}
}