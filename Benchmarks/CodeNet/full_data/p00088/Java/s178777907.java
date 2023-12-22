import java.util.*;

public class Main{
	public static void main(String[] args){
		HashMap<String,Character> map1 = new HashMap<String,Character>();
		map1.put("101",' ');
		map1.put("000000",'\'');
		map1.put("000011",',');
		map1.put("10010001",'-');
		map1.put("010001",'.');
		map1.put("000001",'?');
		map1.put("100101",'A');
		map1.put("10011010",'B');
		map1.put("0101",'C');
		map1.put("0001",'D');
		map1.put("110",'E');
		map1.put("01001",'F');
		map1.put("10011011",'G');
		map1.put("010000",'H');
		map1.put("0111",'I');
		map1.put("10011000",'J');
		map1.put("0110",'K');
		map1.put("00100",'L');
		map1.put("10011001",'M');
		map1.put("10011110",'N');
		map1.put("00101",'O');
		map1.put("111",'P');
		map1.put("10011111",'Q');
		map1.put("1000",'R');
		map1.put("00110",'S');
		map1.put("00111",'T');
		map1.put("10011100",'U');
		map1.put("10011101",'V');
		map1.put("000010",'W');
		map1.put("10010010",'X');
		map1.put("10010011",'Y');
		map1.put("10010000",'Z');

		HashMap<Character,String> map2 = new HashMap<Character,String>();
		map2.put('A',"00000");
		map2.put('B',"00001");
		map2.put('C',"00010");
		map2.put('D',"00011");
		map2.put('E',"00100");
		map2.put('F',"00101");
		map2.put('G',"00110");
		map2.put('H',"00111");
		map2.put('I',"01000");
		map2.put('J',"01001");
		map2.put('K',"01010");
		map2.put('L',"01011");
		map2.put('M',"01100");
		map2.put('N',"01101");
		map2.put('O',"01110");
		map2.put('P',"01111");
		map2.put('Q',"10000");
		map2.put('R',"10001");
		map2.put('S',"10010");
		map2.put('T',"10011");
		map2.put('U',"10100");
		map2.put('V',"10101");
		map2.put('W',"10110");
		map2.put('X',"10111");
		map2.put('Y',"11000");
		map2.put('Z',"11001");
		map2.put(' ',"11010");
		map2.put('.',"11011");
		map2.put(',',"11100");
		map2.put('-',"11101");
		map2.put('\'',"11110");
		map2.put('?',"11111");

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			String out = "";

			for(char ch : s.toCharArray())
				out += map2.get(ch);

			for(int i=0;i<out.length();){
				int len = 1;
				while(i+len<=out.length() && map1.get(out.substring(i,i+len)) == null) len++;
				if(i+len > out.length()) break;
				System.out.print(map1.get(out.substring(i,i+len)));
				i += len;
			}
			System.out.println();
		}
	}
}