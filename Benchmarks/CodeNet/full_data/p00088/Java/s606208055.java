import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String input = br.readLine();

			if(input == null){
				break;
			}
			Translator tr = new Translator();
			Solver sv = new Solver();

			System.out.println(sv.generateString(tr.genelrateBits(input)));
		}
	}

}

class Translator {
	private String[] code = new String[256];

	public Translator(){
		code[' '] = "101";
		code['\''] = "000000";
		code[','] = "000011";
		code['-'] = "10010001";
		code['.'] = "010001";
		code['?'] = "000001";
		code['A'] = "100101";
		code['B'] = "10011010";
		code['C'] = "0101";
		code['D'] = "0001";
		code['E'] = "110";
		code['F'] = "01001";
		code['G'] = "10011011";
		code['H'] = "010000";
		code['I'] = "0111";
		code['J'] = "10011000";
		code['K'] = "0110";
		code['L'] = "00100";
		code['M'] = "10011001";
		code['N'] = "10011110";
		code['O'] = "00101";
		code['P'] = "111";
		code['Q'] = "10011111";
		code['R'] = "1000";
		code['S'] = "00110";
		code['T'] = "00111";
		code['U'] = "10011100";
		code['V'] = "10011101";
		code['W'] = "000010";
		code['X'] = "10010010";
		code['Y'] = "10010011";
		code['Z'] = "10010000";
		
	}
	
	public String genelrateBits(String input){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length(); i++){
			sb.append(code[input.charAt(i)]);
		}
		//0??????
		while(sb.length()%5 != 0){
			sb.append("0");
		}
		return sb.toString();
	}
}

class Solver{
	HashMap<String, String> map = new HashMap<String, String>();
	
	public Solver(){
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
	}
	
	public String generateString(String bits){
		int n = bits.length()/5;
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < n; i++){
			sb.append(map.get(bits.substring(i*5, i*5+5)));
		}
		
		return sb.toString();
	}
}