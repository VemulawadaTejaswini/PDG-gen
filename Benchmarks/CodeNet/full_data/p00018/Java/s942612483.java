import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int[] input = new int[tmpArray.length];
		for(int i = 0; i < tmpArray.length ; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		Arrays.sort(input);
		
		for(int i = input.length - 1; i >= 0; i--){
			System.out.print(input[i]);
			if(i != 0){
				System.out.print(" ");
			}
			else{
				System.out.println();
			}
		}
	}

}