import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		
		String[] tmpArray = br.readLine().split(" ");
		
		int oddPattern = 1;
		for(int i = 0; i < n; i++){
			int tmp = Integer.parseInt(tmpArray[i]);
			
			if(tmp % 2 == 0){
				oddPattern *= 2;
			}
			else {
				oddPattern *= 1;
			}
		}
//		System.out.println("odd" + oddPattern);
		int evenPattern = (int)Math.pow(3, n) - oddPattern;
		System.out.println(evenPattern);
		
	}

}
