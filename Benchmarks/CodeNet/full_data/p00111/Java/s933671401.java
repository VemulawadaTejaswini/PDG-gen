import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Doctor's Memorable Codes
 */
public class Main {

	static final Map<Character, String> c1 = new HashMap<>();

	static {
		c1.put('A', "00000");
		c1.put('B', "00001");
		c1.put('C', "00010");
		c1.put('D', "00011");
		c1.put('E', "00100");
		c1.put('F', "00101");
		c1.put('G', "00110");
		c1.put('H', "00111");
		c1.put('I', "01000");
		c1.put('J', "01001");
		c1.put('K', "01010");
		c1.put('L', "01011");
		c1.put('M', "01100");
		c1.put('N', "01101");
		c1.put('O', "01110");
		c1.put('P', "01111");
		c1.put('Q', "10000");
		c1.put('R', "10001");
		c1.put('S', "10010");
		c1.put('T', "10011");
		c1.put('U', "10100");
		c1.put('V', "10101");
		c1.put('W', "10110");
		c1.put('X', "10111");
		c1.put('Y', "11000");
		c1.put('Z', "11001");
		c1.put(' ', "11010");
		c1.put('.', "11011");
		c1.put(',', "11100");
		c1.put('-', "11101");
		c1.put('\'', "11110");
		c1.put('?', "11111");
	}

	static final Map<String, Character> c2 = new HashMap<>();

	static {
		c2.put("101", ' ');
		c2.put("000000", '\'');
		c2.put("000011", ',');
		c2.put("10010001", '-');
		c2.put("010001", '.');
		c2.put("000001", '?');
		c2.put("100101", 'A');
		c2.put("10011010", 'B');
		c2.put("0101", 'C');
		c2.put("0001", 'D');
		c2.put("110", 'E');
		c2.put("01001", 'F');
		c2.put("10011011", 'G');
		c2.put("010000", 'H');
		c2.put("0111", 'I');
		c2.put("10011000", 'J');
		c2.put("0110", 'K');
		c2.put("00100", 'L');
		c2.put("10011001", 'M');
		c2.put("10011110", 'N');
		c2.put("00101", 'O');
		c2.put("111", 'P');
		c2.put("10011111", 'Q');
		c2.put("1000", 'R');
		c2.put("00110", 'S');
		c2.put("00111", 'T');
		c2.put("10011100", 'U');
		c2.put("10011101", 'V');
		c2.put("000010", 'W');
		c2.put("10010010", 'X');
		c2.put("10010011", 'Y');
		c2.put("10010000", 'Z');
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringBuilder line2 = new StringBuilder();

			for (char c : line.toCharArray()) {
				line2.append(c1.get(c));
			}

			int p, q;
			p = 0;
			q = 1;

			StringBuilder line3 = new StringBuilder();

			while (true) {
				if (c2.containsKey(line2.substring(p, q))) {
					line3.append(c2.get(line2.substring(p, q)));
					p = q;
					q = p + 1;
				} else {
					if (line2.substring(p).indexOf('1') < 0) {
						break;
					}
					q++;
				}
			}

			System.out.println(line3.toString());
		}
	}
}