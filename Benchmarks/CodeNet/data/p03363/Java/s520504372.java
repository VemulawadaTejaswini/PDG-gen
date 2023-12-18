import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray = br.readLine().split(" ");
		int input[] = new int[n];
		
		for(int i = 0; i < n; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		long result = 0;
		
		for(int i = 0; i < n; i++){
			long tmp = 0;
			for(int j = i; j < n; j++){
				tmp += input[j];
				
//				System.out.print(tmp +" ");
				if(tmp == 0){
					result++;
				}
			}
		}
		
		System.out.println(result);
	}

}

