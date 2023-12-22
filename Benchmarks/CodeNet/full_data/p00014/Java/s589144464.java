

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			int d = Integer.parseInt(line);
			System.out.println(calc(d));
		}
	}

	public static int calc(int d) {
		int ret = 0;
		for (int i = d; i <= 600 - d; i += d) {
			ret += i * i * d;
		}
		return ret;
	}

}