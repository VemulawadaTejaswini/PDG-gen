import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

class Translator {
	String t,res;
	HashMap<String,String> map = new HashMap<String,String>();
	HashMap<String,String> back = new HashMap<String,String>();
	Translator() {
		this.res = "";
		map.put(" ","101");
		map.put("\'","000000");
		map.put(",","000011");
		map.put("-","10010001");
		map.put(".","010001");
		map.put("?","000001");
		map.put("A","100101");
		map.put("B","10011010");
		map.put("C","0101");
		map.put("D","0001");
		map.put("E","110");
		map.put("F","01001");
		map.put("G","10011011");
		map.put("H","010000");
		map.put("I","0111");
		map.put("J","10011000");
		map.put("K","0110");
		map.put("L","00100");
		map.put("M","10011001");
		map.put("N","10011110");
		map.put("O","00101");
		map.put("P","111");
		map.put("Q","10011111");
		map.put("R","1000");
		map.put("S","00110");
		map.put("T","00111");
		map.put("U","10011100");
		map.put("V","10011101");
		map.put("W","000010");
		map.put("X","10010010");
		map.put("Y","10010011");
		map.put("Z","10010000");
		back.put("00000","A");
		back.put("00001","B");
		back.put("00010","C");
		back.put("00011","D");
		back.put("00100","E");
		back.put("00101","F");
		back.put("00110","G");
		back.put("00111","H");
		back.put("01000","I");
		back.put("01001","J");
		back.put("01010","K");
		back.put("01011","L");
		back.put("01100","M");
		back.put("01101","N");
		back.put("01110","O");
		back.put("01111","P");
		back.put("10000","Q");
		back.put("10001","R");
		back.put("10010","S");
		back.put("10011","T");
		back.put("10100","U");
		back.put("10101","V");
		back.put("10110","W");
		back.put("10111","X");
		back.put("11000","Y");
		back.put("11001","Z");
		back.put("11010"," ");
		back.put("11011",".");
		back.put("11100",",");
		back.put("11101","-");
		back.put("11110","\'");
		back.put("11111","?");
	}

	void set(String s,int c) {
		this.t = "";
		if (c>0) {
			this.t = map.get(" ");
		} 
		int n = s.length();
		for (int i=0;i<n;i++) {
			this.t = this.t+map.get(""+s.charAt(i));
		}
	}

	String put() {
		int n = this.t.length();
		if (n%5>0) {
			int m = 5-(n%5);
			n += m;
			for (int i=0;i<m;i++) this.t = this.t+"0";
		}
		n /= 5;
		for (int i=0;i<n;i++) {
			this.res = this.res+back.get(this.t.substring(i*5,i*5+5));
		}
		return this.res;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf,res;

		try {
			Translator t = new Translator();
			int c = 0;
			res = "";
			while ((buf = br.readLine())!=null) {
				t.set(buf,c);
				res = res+t.put();
				c++;
			}
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}