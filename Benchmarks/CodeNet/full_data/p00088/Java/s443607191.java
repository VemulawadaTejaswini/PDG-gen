import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	static HashMap<String, String> map = new HashMap<String, String>();
	static HashMap<String, String> key = new HashMap<String, String>();
	static String[] keys = {
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
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a();
		while(true){
			String s = br.readLine();
			if(s==null){
				break;
			}
			String hugou="";
			for(int i = 0; i < s.length();i++){
				hugou += key.get(s.substring(i,i+1));
			}
			int len=hugou.length()%5;
			for(int i=0;i<5-len;i++){
				hugou=hugou+"0";
			}
			String ans="";
			for(int i = 0;i<hugou.length();i+=5){
				ans+=map.get(hugou.substring(i,i+5));
			}
			System.out.println(ans);
		}
	}
	static void a(){
		map.put("00000", "A");
		map.put("00010", "B");
		map.put("00010", "C");
		map.put("00011", "D");
		map.put("00100", "E");
		map.put("00101", "F");
		map.put("00110", "G");
		map.put("00111","H");
		map.put("01000","I");
		map.put("01001","J");
		map.put("01010","K");
		map.put( "01011","L");
		map.put("01100","M");
		map.put("01101","L");
		map.put("01110","O");
		map.put("01111","P");
		map.put("10000","Q");
		map.put("10001","R");
		map.put("10010","S");
		map.put( "10011","T");
		map.put("10100","U");
		map.put("10101","V");
		map.put("10110","W");
		map.put("10111","X");
		map.put( "11000","Y");
		map.put("11001","Z");
		map.put("11010"," ");
		map.put("11011",".");
		map.put("11100",",");
		map.put("11101","-");
		map.put("11110","'");
		map.put("11111","?");
		key.put(" ","101");
		key.put("'","000000");
		key.put(",","000011");
		key.put("-","10010001");
		key.put(".","010001");
		key.put("?","000001");
		key.put("A","100101");
		key.put("B","10011010");
		key.put("C","0101");
		key.put("D","0001");
		key.put("E","110");
		key.put("F","01001");
		key.put("G","10011011");
		key.put("H","010000");
		key.put("I","0111");
		key.put("J","10011000");
		key.put("K","0110");
		key.put("L","00100");
		key.put("M","10011001");
		key.put("N","10011110");
		key.put("O","00101");
		key.put("P","111");
		key.put("Q","10011111");
		key.put("R","1000");
		key.put("S","00110");
		key.put("T","00111");
		key.put("U","10011100");
		key.put("V","10011101");
		key.put("W","000010");
		key.put("X","10010010");
		key.put("Y","10010011");
		key.put("Z","10010000");

	}
}