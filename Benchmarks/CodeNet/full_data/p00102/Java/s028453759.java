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
		while((str = reader.readLine()) != null){
			n = Integer.parseInt(str);
			if(n == 0)break;
			int[][] list = new int[n+1][n+1];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					list[i][j] = Integer.parseInt(reader.readLine());
					list[i][n] += list[i][j];
		}
				for(int j = 0; j < n; j++)
					list[n][j] += list[i][j];
		}
			for(int i = 0; i < n; i++)
				list[n][n] += list[n][i];
					
			for(int i = 0; i < n + 1; i++){
				for(int j = 0; j < n + 1; j++)
					System.out.printf("%" + String.valueOf(list[n][n]).length() + 1 + "d", list[i][j]);
				
				System.out.println();
			}
		}
		}catch(IOException e){
		}
		try{
			reader.close();
		}catch(IOException e){
		}
	}
}