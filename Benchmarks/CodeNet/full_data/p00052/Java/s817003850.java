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
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			System.out.println(Factorial.numOfLast0(n));
		}
	}

}

class Factorial {
	public static long factor(int n){
		long result = 1;
		
		for(int i = 2; i <= n ; i++){
			result *= i;
		}
		
		return result;
	}
	
	public static int numOfLast0(int n){
		int two = 0;
		int five = 0;
		int result = 0;
		
		for(int i = 2; i <= n ; i++){
			int tmp = i;
			while(tmp % 2 == 0){
				tmp /= 2;
				two++;
			}
			while(tmp % 5 == 0){
				tmp /= 5;
				five++;
			}
		}
		
		while(two > 0 && five > 0){
			result++;
			two--;
			five--;
		}
		
		return result;
	}
}