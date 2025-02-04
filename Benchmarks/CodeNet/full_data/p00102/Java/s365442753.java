import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args){
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		int n;
		
		try{
		while((str = reader.readLine()) != "0"){
			n = Integer.parseInt(str);

			int[][] list = new int[n + 1][n + 1];
			
			for(int i = 0; i < n; i++){
				String[] x = reader.readLine().split(" ");
				for(int j = 0; j < n; j++){
					list[i][j] = Integer.parseInt(x[j]);
					list[i][n] += list[i][j];
		}
				list[n][n] += list[i][n];
				
				for(int j = 0; j < n; j++)
					list[n][j] += list[i][j];
		}
			for(int i = 0; i < n + 1; i++){
				for(int j = 0; j < n + 1; j++)
					System.out.printf("%5d", list[i][j]);
				
				System.out.println();
			}
		}
		reader.close();
		}catch(IOException e){
		}
	}
}