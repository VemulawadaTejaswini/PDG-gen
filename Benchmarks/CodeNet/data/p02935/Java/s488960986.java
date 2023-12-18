import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int v[] = new int [n];
		String str[] = new String [n];
		String line;
		try {
			line = br.readLine();
			str = line.split(" ");
			for (int i = 0; i < n; i++) {
				v[i] = Integer.parseInt(str[i]);
			}
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		if(n % 2 == 0) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += v[i];
			}
			System.out.println(sum / 2.0);
		} else {
			int max = v[0];
			int max_i = 0;
			int sum = 0;
			for (int i = 1; i < n; i++) {
				if (max < v[i]) {
					max = v[i];
					sum += v[max_i];
					max_i = i;
					sum -= v[i];
				}
				sum += v[i];
			}
			System.out.println((sum / 2.0 + max) / 2.0);
		}
		
	}
}