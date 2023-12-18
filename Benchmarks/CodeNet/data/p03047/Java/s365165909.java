import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {		

		try(BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in))) {
			int N = Integer.parseInt(br.readLine());
			int K = Integer.parseInt(br.readLine());
			
			int output = (N - K) + 1;
			
			System.out.println(output);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}