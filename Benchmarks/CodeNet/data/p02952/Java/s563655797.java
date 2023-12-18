
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int n = Integer.parseInt(input);
		
		int result = 0;
		
		for(int i = 1; i < input.length(); i += 2){
			result += 9*Math.pow(10, i - 1);
		}
		
		if(input.length() % 2 == 1){
			result += n - Math.pow(10, input.length() - 1) + 1;
			
			if(n % 10 == 0){
				result -= 0;
			}
		}
		System.out.println(result);
	}

}
