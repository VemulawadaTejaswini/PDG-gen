import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String in[] = new String[2];
		long l = 0, r = 0;
		try {
			line = br.readLine();
			in = line.split(" ");
			l = Long.parseLong(in[0]);
			r = Long.parseLong(in[1]);
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		int min = 2020;
		int mod;
		for (long i = l; i < r; i++) {
			for (long j = i+1; j <= r; j++) {
				if(min > (mod =(int) ((i*j) % 2019))) {
					min = mod;
					if(min == 0) break;
				}
			}
			if(min == 0) break;
		}
	System.out.println(min);		
	}
}