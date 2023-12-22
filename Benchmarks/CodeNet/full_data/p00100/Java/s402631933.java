import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			int[][] data = new int[1001][4];
			//?????????????????????
			for(int i = 0; i < data.length ; i++){
				for(int j = 0; j < data[i].length; j++){
					data[i][j] = 0;
				}
			}
			
			//?????????????????????
			for(int i = 0; i < n ; i++){
				String[] tmpArray = br.readLine().split(" ");
				
				//int ID = Integer.parseInt(tmpArray[0]);
				for(int j = 0; j < 3; j++){

					data[i][j] = Integer.parseInt(tmpArray[j]);
				}
			}
			
			//?????????????¨?
			long[] result = new long[4001];
			
			for(int i = 0; i < result.length ; i++){
				result[i] = 0;
			}
			
			for(int i = 0; i < data.length; i++){
				if(data[i][0] > 0 && result[data[i][0]] < 1000000){
					result[data[i][0]] += data[i][1]*data[i][2];
				}
			}
			
			//????????????
			int count = 0;
			for(int i = 1; i < result.length; i++){
				if(result[i] >= 1000000){
					System.out.println(i);
					count++;
				}
			}
			
			if(count == 0){
				System.out.println("NA");
			}
		}
	}

}