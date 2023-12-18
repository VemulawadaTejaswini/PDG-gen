import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		String str = input.readLine( );
		int n = Integer.parseInt(str);

		str = input.readLine( );
		String[] strlist = str.split(" ");
		int[] list = new int[n*2];
		for(int i=0; i<n*2; i++){
			list[i] = Integer.parseInt(strlist[i]);
		}

		Arrays.sort(list);

		int answer = 0;

		for(int i=0; i<n; i++){
			answer = answer + list[i*2];
		}

		System.out.println(answer);
	}
}
