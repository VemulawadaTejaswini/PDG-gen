import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	
	public static void main(String[] args) throws IOException{
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String input = bufferedReader.readLine();
		int r = Integer.parseInt(input);
		
		String result = "AGC";
		
		if(r < 1200) {
			result = "ABC";
		}else if(r < 2800) {
			result = "ARC";
		}
		
		print(result);
	}
	
	public static void print(String string) {
		System.out.println(string);
	}

}
