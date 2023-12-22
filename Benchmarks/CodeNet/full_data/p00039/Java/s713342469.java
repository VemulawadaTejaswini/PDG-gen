import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	class Roman {
		String figure;
		public Roman(String s) {
			figure = new String(s);
		}

		private int getNumber(char c) {
			switch (c) {
			case 'I': return 1;
			case 'V': return 5;
			case 'X': return 10;
			case 'L': return 50;
			case 'C': return 100;
			case 'D': return 500;
			case 'M': return 1000;
			default: return 0;
			}
		}

		public long toArabic() {
			int prev = Integer.MAX_VALUE;
			long count = 0;
			for (int i = 0 ; i < figure.length() ; i++) {
				int current = getNumber(figure.charAt(i));
				if (prev >= current) {
					count += current;
				} else {
					count = count - prev*2 + current;
				}
				prev = current;
			}
			return count;
		}
	}


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Main m = new Main();

		String line;
		while ((line = br.readLine()) != null) {
			Roman roman = m.new Roman(line);
			System.out.println(roman.toArabic());
		}

	}

}