import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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
		int[] numbers = new int[n];
		
		for(int i = 0; i < n;i++){
			numbers[i] = Integer.parseInt(tmpArray[i]);
		}
		
		System.out.println(solve(numbers));
	}
	
	static int solve(int[] numbers){
		int n = numbers.length;
		
		int bestNum = -1;
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				int tmp = numbers[i]*numbers[j];
				
				if(increasing(tmp) && bestNum < tmp){
					bestNum = tmp;
				}
			}
		}
		
		return bestNum;
	}
	
	static boolean increasing(int n){
		char[] num = Integer.toString(n).toCharArray();
		
		for(int i = 1; i < num.length; i++){
			if(num[i] != num[i - 1] + 1){
				return false;
			}
		}
		
		return true;
	}

}