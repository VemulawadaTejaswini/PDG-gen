import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs;
		inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int k = Integer.parseInt(inputs[1]);

		char s[] = new char[n];
		s = br.readLine().toCharArray();

		int sum = 0;
		char prev = ' ';
		for ( int i = 0; i < n; i++ ) {
			if(prev == s[i]) {
				sum++;
			}
			prev = s[i];
		}
		System.out.print(Math.min(n-1, sum + k*2));
		br.close();
	}
}