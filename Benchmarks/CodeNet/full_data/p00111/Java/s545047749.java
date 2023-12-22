import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	static HashMap<String , String> map = new HashMap<String , String>();
	static HashMap<String , String> key = new HashMap<String , String>();
	static String[] keys = {"101", "000000",
		"000011",
		"10010001",
		"010001",
		"000001",
		"10011010",
		"0101",
		"0001",
		"110",
		"01001",
		"10011011",
		"0100000",
		"0111",
		"10011000",
		"0110",
		"00100",
		"10011001",
		"10011110",
		"00101",
		"111",
		"10011111",
		"1000",
		"00110",
		"00111",
		"10011100",
		"10011101",
		"000010",
		"10010010",
	"10010011"};
	public static void main(String[] args) throws IOException {
		a();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str = br.readLine();
			String hugou = "";
			for(int i = 0; i < str.length(); i++){
				hugou += map.get(String.valueOf(str.charAt(i)));
			}
			for(;hugou.length()!=0;){
				int i;
				for(i = 0; i < keys.length; i++){
					if(hugou.length() >= keys[i].length())
						if(hugou.substring(0, keys[i].length()).equals(keys[i])){
							hugou = hugou.substring(keys[i].length());
							System.out.print(key.get(keys[i]));
							break;
						}
				}
				if(i==keys.length){
					break;
				}
			}
			System.out.println();

		}

	}
	static void a(){
		map.put("A", "00000");
		map.put("B", "00001");
		map.put("C", "00010");
		map.put("D", "00011");
		map.put("E", "00100");
		map.put("F", "00101");
		map.put("G", "00110");
		map.put("H", "00111");
		map.put("I", "01000");
		map.put("J", "01001");
		map.put("K", "01010");
		map.put("L", "01011");
		map.put("M", "01100");
		map.put("N", "01101");
		map.put("O", "01110");
		map.put("P", "01111");
		map.put("Q", "10000");
		map.put("R", "10001");
		map.put("S", "10010");
		map.put("T", "10011");
		map.put("U", "10100");
		map.put("V", "10101");
		map.put("W", "10110");
		map.put("X", "10111");
		map.put("Y", "11000");
		map.put("Z", "11001");
		map.put(" ", "11010");
		map.put(".", "11011");
		map.put(",", "11100");
		map.put("-", "11101");
		map.put("'", "11110");
		map.put("?", "11111");
		key.put("101", " ");
		key.put("000000", "'");
		key.put("000011", ",");
		key.put("10010001", "-");
		key.put("010001", ".");
		key.put("000001", "?");
		key.put("10011010", "A");
		key.put("0101", "C");
		key.put("0001", "D");
		key.put("110", "E");
		key.put("01001", "F");
		key.put("10011011", "G");
		key.put("0100000", "H");
		key.put("0111", "I");
		key.put("10011000", "J");
		key.put("0110", "K");
		key.put("00100", "L");
		key.put("10011001", "M");
		key.put("10011110", "N");
		key.put("00101", "O");
		key.put("111", "P");
		key.put("10011111", "Q");
		key.put("1000", "R");
		key.put("00110", "S");
		key.put("00111", "T");
		key.put("10011100", "U");
		key.put("10011101", "V");
		key.put("000010", "W");
		key.put("10010010", "X");
		key.put("10010011", "Y");
		key.put("10010000", "Z");
	}
}