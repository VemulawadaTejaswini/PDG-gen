import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		String[] input = buf.split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		String result = new String();
		if(a < b){
			result = "a < b";
		}else if(a > b){
			result = "a > b";
		}else{
			result = "a == b";
		}
		System.out.println(result);
	}
}