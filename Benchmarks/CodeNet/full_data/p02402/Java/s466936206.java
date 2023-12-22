import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		long min = 1000000;
		long max = -1000000;
		long sum = 0;
		long tmp = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		String[] str2 = str.split(" ");
		
		for (int i = 0; i < n; i++ ) {
			tmp = Integer.parseInt(str2[i]);
			if (tmp > max) {
				tmp = max;
			}
			if (tmp < min) {
				min = tmp;
			}
			sum = sum + tmp;
		}
		System.out.println(min + " " + max + " " + sum);
	}	
}