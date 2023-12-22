import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * The Code A Doctor Loved
 */
public class Main {

	static final HashMap<Character, String> c1 = new HashMap<Character, String>(32) {
		{
			put(' ', "101");
			put('\'', "000000");
			put(',', "000011");
			put('-', "10010001");
			put('.', "010001");
			put('?', "000001");
			put('A', "100101");
			put('B', "10011010");
			put('C', "0101");
			put('D', "0001");
			put('E', "110");
			put('F', "01001");
			put('G', "10011011");
			put('H', "010000");
			put('I', "0111");
			put('J', "10011000");
			put('K', "0110");
			put('L', "00100");
			put('M', "10011001");
			put('N', "10011110");
			put('O', "00101");
			put('P', "111");
			put('Q', "10011111");
			put('R', "1000");
			put('S', "00110");
			put('T', "00111");
			put('U', "10011100");
			put('V', "10011101");
			put('W', "000010");
			put('X', "10010010");
			put('Y', "10010011");
			put('Z', "10010000");
		}
	};

	static final HashMap<String, Character> c2 = new HashMap<String, Character>(32) {
		{
			put("00000", 'A');
			put("00001", 'B');
			put("00010", 'C');
			put("00011", 'D');
			put("00100", 'E');
			put("00101", 'F');
			put("00110", 'G');
			put("00111", 'H');
			put("01000", 'I');
			put("01001", 'J');
			put("01010", 'K');
			put("01011", 'L');
			put("01100", 'M');
			put("01101", 'N');
			put("01110", 'O');
			put("01111", 'P');
			put("10000", 'Q');
			put("10001", 'R');
			put("10010", 'S');
			put("10011", 'T');
			put("10100", 'U');
			put("10101", 'V');
			put("10110", 'W');
			put("10111", 'X');
			put("11000", 'Y');
			put("11001", 'Z');
			put("11010", ' ');
			put("11011", '.');
			put("11100", ',');
			put("11101", '-');
			put("11110", '\'');
			put("11111", '?');
		}
	};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null) {
			//
			if (line.isEmpty()) {
				System.out.println("");
				continue;
			}
			StringBuilder sb1, sb2;
			sb1 = new StringBuilder();
			sb2 = new StringBuilder();
			for (char c : line.toCharArray()) {
				sb1.append(c1.get(c));
			}
			//
			sb1.append("00000");
			//
			String line2 = sb1.toString();
			for (int i = 0; i < line2.length() - 5; i += 5) {
				sb2.append(c2.get(line2.substring(i, i + 5)));
			}
			System.out.println(sb2.toString());
		}
	}
}