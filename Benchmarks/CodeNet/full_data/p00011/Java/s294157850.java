import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] a){

		int NumberOfColumn = 0;
		int NumberOfBar = 0;
		int[][] arr;
		int[] ans;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String tmpString;
		try {
			if(null != (tmpString = bf.readLine())){
				NumberOfColumn = Integer.parseInt(tmpString);
			}
			if(null != (tmpString = bf.readLine())){
				NumberOfBar = Integer.parseInt(tmpString);
			}
			arr = new int[NumberOfBar][2];
			for(int i = 0; i < NumberOfBar; i++){
				if(null != (tmpString = bf.readLine())){
					String[]  tmp = tmpString.split(",");
					arr[i][0] = Integer.parseInt(tmp[0]);
					arr[i][1] = Integer.parseInt(tmp[1]);
				}
			}

			ans = new int[NumberOfColumn];
			for(int i = 0; i < NumberOfColumn; i++){
				ans[i] = i + 1;
				for(int j = 0; j < NumberOfBar; j++){
					if(arr[j][0] == ans[i]){
						ans[i] = arr[j][1];
					} else if(arr[j][1] == ans[i]){
						ans[i] = arr[j][0];
					}
				}
			}
			for(int i = 0; i < NumberOfColumn; i++){
				for(int j = 0; j < NumberOfColumn; j++ ){
					if(ans[j] == i + 1){
						System.out.println(j + 1);
						break;
					}
				}
			}

		} catch (Exception e) {
			System.err.println("error");
		} finally {
			try {
				bf.close();
			} catch (IOException e) {
			}
		}

	}

}