import java.util.*;

public class Main{
	
	String [] data = {"100101",
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
			"10010000",
			"101",
			"000000",
			"000011",
			"10010001",
			"010001",
			"000001"};
	HashMap<String, String> map;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		init();
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			int len = s.length();
			for(int i = 0; i < len; i++){
				char c = s.charAt(i);
				switch(c){
				case ' ':
					sb.append("101");
					break;
				case '\'':
					sb.append("000000");
					break;
				case ',':
					sb.append("000011");
					break;
				case '-':
					sb.append("10010001");
					break;
				case '.':
					sb.append("010001");
					break;
				case '?':
					sb.append("000001");
					break;
				default:
					sb.append(data[(int)(c - 'A')]);
				}
			}
			int len2 = (5 - sb.length() % 5) % 5;
			for(int i = 0; i < len2; i++){
				sb.append("0");
			}
			StringBuilder ans = new StringBuilder();
			for(int i = 0; i < sb.length(); i += 5){
				String sub = sb.substring(i, i + 5);
				ans.append(map.get(sub));
			}
			System.out.println(ans.toString());
		}
	}
	
	private void init() {
		map = new HashMap<String, String>();
		map.put("00000","A");
		map.put("00001","B");
		map.put("00010","C");
		map.put("00011","D");
		map.put("00100","E");
		map.put("00101","F");
		map.put("00110","G");
		map.put("00111","H");
		map.put("01000","I");
		map.put("01001","J");
		map.put("01010","K");
		map.put("01011","L");
		map.put("01100","M");
		map.put("01101","N");
		map.put("01110","O");
		map.put("01111","P");
		map.put("10000","Q");
		map.put("10001","R");
		map.put("10010","S");
		map.put("10011","T");
		map.put("10100","U");
		map.put("10101","V");
		map.put("10110","W");
		map.put("10111","X");
		map.put("11000","Y");
		map.put("11001","Z");
		map.put("11010"," ");
		map.put("11011",".");
		map.put("11100",",");
		map.put("11101","-");
		map.put("11110","'");
		map.put("11111","?");
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}