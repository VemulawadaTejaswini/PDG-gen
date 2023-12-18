import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String [] input = br.readLine().split(" ");
		long N = Long.parseLong(input[0]);
		long X = Long.parseLong(input[1]);
		long result = 0;

		if((double)N/2 == X) {
			result = 3*X;
		}else if((double)N/2 <= X) {
			result = X + (N-X)*(X);
		}else {
			result = X + (N-X) +  2*X + ((N-X) -X)*(X);
		}
		System.out.println(result);
	}

}
