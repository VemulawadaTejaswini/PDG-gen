import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int n = Integer.parseInt(str);
		int m = 100000;
		int f = 100000;

		if(n%2 == 1){
			n += 1;
		}

		for(int i=0; i<n; i++){
			m += (f/20);
		}

		System.out.print(m);

	}
}