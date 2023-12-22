import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			
			if(a == 0 && b == 0){
				break;
			}
			
			int n = Integer.parseInt(br.readLine());
			
			int[][] pattern = new int[b + 1][a + 1];
			
			boolean[][] uc = new boolean[b + 1][a + 1];
			
			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");

				int tmp1 = Integer.parseInt(tmpArray[0]);
				int tmp2 = Integer.parseInt(tmpArray[1]);
				
				uc[tmp2][tmp1] = true;
			}
			
			for(int i = 1; i <= b ; i++){
				for(int j = 1; j <= a; j++){
					if(i == 1 && j == 1){
						pattern[i][j] = 1;
					}
					else if(uc[i][j] == false){
						pattern[i][j] = pattern[i-1][j] + pattern[i][j-1];
					}
				}
			}
			
			System.out.println(pattern[b][a]);
			
		}
	}

}