import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] input = new int[3][6];
		
		for(int i = 0; i < 3; i++){
			String[] tmpArray = br.readLine().split(" ");
			for(int j = 0; j < 6; j++){
				input[i][j] = Integer.parseInt(tmpArray[j]);
			}
		}
		
		for(int i = 0; i < 3; i++){
			int seconds = calcTime(input[i]);
			
			System.out.println(seconds/3600 + " "+ (seconds%3600)/60 + " " + seconds%60) ;
		}
	}
	
	static int calcTime (int[] input){
		int start = input[0]*3600 + input[1]*60 + input[2];
		int end = input[3]*3600 + input[4]*60 + input[5];
	
		return end - start;
	}

}