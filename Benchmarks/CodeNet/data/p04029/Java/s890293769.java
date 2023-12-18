
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int s = Integer.parseInt(str);
		int answer = 0;

		for(int i=s; i>0; i--){
			answer = answer + i;
		}

		System.out.println(answer);
	}

}
