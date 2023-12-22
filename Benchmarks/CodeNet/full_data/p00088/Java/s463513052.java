import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		Main instance = new Main();
		instance.execute();
	}
	
	private void execute() throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, String> encriptMap = getEncriptMap();
		Map<String, String> decriptMap = getDecriptMap();

		StringBuilder sb;
		StringBuilder result;
		String line;
		while((line = sc.readLine()) != null) {
			sb = new StringBuilder();
			for(int i = 0 ; i < line.length() ; i++) {
				sb.append(encriptMap.get(line.substring(i, i + 1)));
			}
			
			while(sb.length() % 5 > 0) {
				sb.append("0");
			}
			
			result = new StringBuilder();
			for(int i = 0 ; i < sb.length(); i = i + 5) {
				result.append(decriptMap.get(sb.substring(i, i + 5)));
			}
			System.out.println(result.toString());
		}
	}
	
	private Map<String, String> getEncriptMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put(" ", "101");
		map.put("'", "000000");
		map.put(",", "000011");
		map.put("-", "10010001");
		map.put(".", "010001");
		map.put("?", "000001");
		map.put("A", "100101");
		map.put("B", "10011010");
		map.put("C", "0101");
		map.put("D", "0001");
		map.put("E", "110");
		map.put("F", "01001");
		map.put("G", "10011011");
		map.put("H", "010000");
		map.put("I", "0111");
		map.put("J", "10011000");
		map.put("K", "0110");
		map.put("L", "00100");
		map.put("M", "10011001");
		map.put("N", "10011110");
		map.put("O", "00101");
		map.put("P", "111");
		map.put("Q", "10011111");
		map.put("R", "1000");
		map.put("S", "00110");
		map.put("T", "00111");
		map.put("U", "10011100");
		map.put("V", "10011101");
		map.put("W", "000010");
		map.put("X", "10010010");
		map.put("Y", "10010011");
		map.put("Z", "10010000");
		return map;
	}
	private Map<String, String> getDecriptMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("00000", "A");
		map.put("00001", "B");
		map.put("00010", "C");
		map.put("00011", "D");
		map.put("00100", "E");
		map.put("00101", "F");
		map.put("00110", "G");
		map.put("00111", "H");
		map.put("01000", "I");
		map.put("01001", "J");
		map.put("01010", "K");
		map.put("01011", "L");
		map.put("01100", "M");
		map.put("01101", "N");
		map.put("01110", "O");
		map.put("01111", "P");
		map.put("10000", "Q");
		map.put("10001", "R");
		map.put("10010", "S");
		map.put("10011", "T");
		map.put("10100", "U");
		map.put("10101", "V");
		map.put("10110", "W");
		map.put("10111", "X");
		map.put("11000", "Y");
		map.put("11001", "Z");
		map.put("11010", " ");
		map.put("11011", ".");
		map.put("11100", ",");
		map.put("11101", "-");
		map.put("11110", "'");
		map.put("11111", "?");
		return map;
	}
}