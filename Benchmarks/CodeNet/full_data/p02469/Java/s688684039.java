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
		int n = Integer.parseInt(br.readLine());
		
		String[] tmpArray = br.readLine().split(" ");
		int[] input = new int[n];
		
		for(int i = 0 ; i < n ; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}
		
		int result = lcm(input);
		
		System.out.println(result);

	}

	static int gcd(int a, int b) {
	    if (b == 0){
	        return a;
	    }
	    return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
	    return a * b / gcd(a, b);
	}
	
	static int lcm(int[] array){
		int result = array[array.length - 1];
		
		for(int i = array.length - 2 ; i >= 0 ; i--){
			result = lcm(result, array[i]);
		}
		
		return result;
	}

}