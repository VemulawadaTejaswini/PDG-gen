import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	private static String[] encode = {
		"101",
		"000000",
		"000011",
		"10010001",
		"010001",
		"000001",
		"100101",
		"10011010",
		"0101",
		"0001",
		"110",
		"01001",
		"10011011",
		"010000",
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
		"10010011",
		"10010000"
	};
	
	private static Map<String,Character> decode = new HashMap<String,Character>();
	
	private static String encodeChar(char c){
		if(c >= 'A' && c <= 'Z'){
			return encode[c-'A'+6];
		}else if(c == ' '){
			return encode[0];
		}else if(c == '\''){
			return encode[1];
		}else if(c == ','){
			return encode[2];
		}else if(c == '-'){
			return encode[3];
		}else if(c == '.'){
			return encode[4];
		}else if(c == '?'){
			return encode[5];
		}else{
			return null;
		}
	}
	
	private static void init_decode(){
		decode.put("00000", 'A');
		decode.put("00001", 'B');
		decode.put("00010", 'C');
		decode.put("00011", 'D');
		decode.put("00100", 'E');
		decode.put("00101", 'F');
		decode.put("00110", 'G');
		decode.put("00111", 'H');
		decode.put("01000", 'I');
		decode.put("01001", 'J');
		decode.put("01010", 'K');
		decode.put("01011", 'L');
		decode.put("01100", 'M');
		decode.put("01101", 'N');
		decode.put("01110", 'O');
		decode.put("01111", 'P');
		decode.put("10000", 'Q');
		decode.put("10001", 'R');
		decode.put("10010", 'S');
		decode.put("10011", 'T');
		decode.put("10100", 'U');
		decode.put("10101", 'V');
		decode.put("10110", 'W');
		decode.put("10111", 'X');
		decode.put("11000", 'Y');
		decode.put("11001", 'Z');
		decode.put("11010", ' ');
		decode.put("11011", '.');	
		decode.put("11100", ',');
		decode.put("11101", '-');
		decode.put("11110", '\'');
		decode.put("11111", '?');
	}
	
	public static void main(String[] args){
		init_decode();
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			char[] strs = sc.nextLine().toCharArray();
			StringBuilder br = new StringBuilder();
			
			for(char c:strs){
				br.append(encodeChar(c));
			}
			
			int tmp;
			if((tmp = br.length()%5) != 0){
				for(int i = 0; i < (5 - tmp); i++){
					br.append("0");
				}
			}
			
			System.out.println(br);
			for(int i = 0; (i + 4) < br.length(); i+=5){
				System.out.print(decode.get(br.substring(i, i+5)));
			}
			System.out.println();
			
		}
	}
}