
import static java.util.Arrays.deepToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		String in = "";
		while (sc.hasNext()) {
			if (in.length() > 0) in += " ";
			in += sc.nextLine();
		}
		char[] s = in.toCharArray();
		char[] t = getCode1(s);
		System.out.println(new String(t));
	}
	
	char[] getCode1(char[] s) {
		ArrayList<Integer> L = new ArrayList<Integer>();
		
		for (char c : s) {
			String t = f(c);
			for (int i = 0; i < t.length(); i++) {
				L.add(t.charAt(i) == '1' ? 1 : 0);
			}
		}
		while (L.size() % 5 > 0) {
			L.add(0);
		}
		
		char[] res = new char[L.size() / 5];
		for (int i = 0; i < L.size(); i += 5) {
			String cc = "";
			for (int j = 0; j < 5; j++) cc += L.get(i + j);
			res[i/5] = g(cc);
		}
		return res;
	}
	
	Map<String, Character> mp;
	
	
	char g(String s) {
		if (mp == null) {
			mp = new HashMap<String, Character>();
			mp.put("00000",'A');
			mp.put("00001",'B');
			mp.put("00010",'C');
			mp.put("00011",'D');
			mp.put("00100",'E');
			mp.put("00101",'F');
			mp.put("00110",'G');
			mp.put("00111",'H');
			mp.put("01000",'I');
			mp.put("01001",'J');
			mp.put("01010",'K');
			mp.put("01011",'L');
			mp.put("01100",'M');
			mp.put("01101",'N');
			mp.put("01110",'O');
			mp.put("01111",'P');
			mp.put("10000",'Q');
			mp.put("10001",'R');
			mp.put("10010",'S');
			mp.put("10011",'T');
			mp.put("10100",'U');
			mp.put("10101",'V');
			mp.put("10110",'W');
			mp.put("10111",'X');
			mp.put("11000",'Y');
			mp.put("11001",'Z');
			mp.put("11010",' ');
			mp.put("11011",'.');
			mp.put("11100",',');
			mp.put("11101",'-');
			mp.put("11110",'\'');
			mp.put("11111",'?');
		}
		return mp.get(s);
	}
	
	String f(char c) {
		switch(c) {
	case ' ': return"101";
	case '\'': return"000000";
	case ',': return"000011";
	case '-': return"10010001";
	case '.': return"010001";
	case '?': return"000001";
	case 'A': return"100101";
	case 'B': return"10011010";
	case 'C': return"0101";
	case 'D': return"0001";
	case 'E': return"110";
	case 'F': return"01001";
	case 'G': return"10011011";
	case 'H': return"010000";
	case 'I': return"0111";
	case 'J': return"10011000";
	case 'K': return"0110";
	case 'L': return"00100";
	case 'M': return"10011001";
	case 'N': return"10011110";
	case 'O': return"00101";
	case 'P': return"111";
	case 'Q': return"10011111";
	case 'R': return"1000";
	case 'S': return"00110";
	case 'T': return"00111";
	case 'U': return"10011100";
	case 'V': return"10011101";
	case 'W': return"000010";
	case 'X': return"10010010";
	case 'Y': return"10010011";
	case 'Z': return"10010000";
		}
		return "";
	}
	
	
}