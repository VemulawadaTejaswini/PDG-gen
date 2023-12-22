import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			int input[] = new int[n];
			
			String[] tmpArray = br.readLine().split(" ");
			
			for(int i = 0; i < n; i++){
				input[i] = Integer.parseInt(tmpArray[i]);
			}
			
			Arrays.sort(input);
			
			int minDiff = Integer.MAX_VALUE;
			for(int i = 0; i < n - 1; i++){
				if(input[i + 1] - input[i] < minDiff){
					minDiff = input[i + 1] - input[i];
				}
			}
			
			System.out.println(minDiff);
		}
	}

}