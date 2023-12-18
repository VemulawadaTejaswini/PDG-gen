import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (is);
		String [] input = br.readLine().split(" ");
		long N = Long.parseLong(input[0]);
		long X = Long.parseLong(input[1]);
		long NX = N-X;
		long result = 0;
		if((double)N/2 == X) {
			result = 3*X;
		}else if(N%(NX)==0) {
			result = X + (NX)*(X+1);
		}else {
			result = X + (NX) +  (1+(N/NX))*(N-NX) + (NX - (N-NX))*X+1;
		}
		System.out.println(result);
	}
}