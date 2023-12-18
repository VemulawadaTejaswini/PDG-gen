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
		int n = Integer.parseInt(br.readLine());



		String[] tmpArray = br.readLine().split(" ");

		int[] input = new int[n];
///		int[] index = new int[100001];
//		Arrays.fill(index, -1);

		int diff = 0;
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
			if(i == input[i]){
				diff++;
			}
		}
		
		System.out.println(Math.max(diff-1,0));
	}

}
