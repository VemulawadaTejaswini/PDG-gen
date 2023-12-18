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
		
		String[] tmpArray = br.readLine().split(" ");
		
		long x = Long.parseLong(tmpArray[0]);
		long y = Long.parseLong(tmpArray[1]);
		
		if(x == y){
			System.out.println(0);
			return;
		}
		
		long result = 0;
		
		while(true){
			x *= 2;
			result ++;
			
			if(x > y){
				break;
			}
		}
		System.out.println(result);
	}

}
