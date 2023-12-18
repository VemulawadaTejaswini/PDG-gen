import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String in[] = new String[2];
		int l = 0, r = 0;
		try {
			line = br.readLine();
			in = line.split(" ");
			l = Integer.parseInt(in[0]);
			r = Integer.parseInt(in[1]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int min = 2020;
		int mod;
		for (int i = l; i < r; i++) {
			for (int j = i+1; j <= r; j++) {
				if(min > (mod =(i*j) % 2019)) {
					min = mod;
					if(min == 0) break;
				}
			}
			if(min == 0) break;
		}
	System.out.println(min);		
	}
}
