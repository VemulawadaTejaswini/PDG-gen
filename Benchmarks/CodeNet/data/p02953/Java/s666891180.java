

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] tmpArray = br.readLine().split(" ");
		
		int[] input = new int[n];
		
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		String result = "Yes";
		for(int i = n - 2; i >= 0; i--){
			if(input[i] > input[i + 1]){
				input[i]--;
			}
			if(input[i] > input[i + 1]){
				result = "No";
				break;
			}
		}
		
		System.out.println(result);
	}

}
