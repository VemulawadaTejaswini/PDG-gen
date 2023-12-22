import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int h, w, n, c, v;
		
		while(!(string = reader.readLine()).equals("0 0")){
			h = Integer.parseInt(string.split(" ")[0]);
			w = Integer.parseInt(string.split(" ")[1]);
			
			int[][] array = new int[h][w];
			boolean[][] imp = new boolean[h][w];
			
			n = Integer.parseInt(reader.readLine());
			for(int i = 0; i < n; i++){
				string = reader.readLine();
				c = Integer.parseInt(string.split(" ")[0]);
				v = Integer.parseInt(string.split(" ")[1]);
				imp[c - 1][v - 1] = true;
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(i == 0 || j == 0){
						if(!imp[i][j]){
							array[i][j] = 1;
						}else{
							array[i][j] = 0;
						}
						continue;
					}
					if(!imp[i][j]){
						array[i][j] = array[i][j - 1] + array[i - 1][j];
					}else{
						array[i][j] = 0;
					}
				}
			}
			System.out.println(array[h - 1][w - 1]);
		}
		reader.close();
	}
}