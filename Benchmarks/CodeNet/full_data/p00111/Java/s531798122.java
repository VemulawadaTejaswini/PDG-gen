import java.util.Scanner;
import java.util.HashMap;
class Main
{
	public static void main(String args[])
	{
		HashMap<Character, String> codeMap = new HashMap<Character, String>();
		codeMap.put('A', "00000");
		codeMap.put('B', "00001");
		codeMap.put('C', "00010");
		codeMap.put('D', "00011");
		codeMap.put('E', "00100");
		codeMap.put('F', "00101");
		codeMap.put('G', "00110");
		codeMap.put('H', "00111");
		codeMap.put('I', "01000");
		codeMap.put('J', "01001");
		codeMap.put('K', "01010");
		codeMap.put('L', "01011");
		codeMap.put('M', "01100");
		codeMap.put('N', "01101");
		codeMap.put('O', "01110");
		codeMap.put('P', "01111");
		codeMap.put('Q', "10000");
		codeMap.put('R', "10001");
		codeMap.put('S', "10010");
		codeMap.put('T', "10011");
		codeMap.put('U', "10100");
		codeMap.put('V', "10101");
		codeMap.put('W', "10110");
		codeMap.put('X', "10111");
		codeMap.put('Y', "11000");
		codeMap.put('Z', "11001");
		codeMap.put(' ', "11010");
		codeMap.put('.', "11011");
		codeMap.put(',', "11100");
		codeMap.put('-', "11101");
		codeMap.put('\'', "11110");
		codeMap.put('?', "11111");
		HashMap<String, Character> charMap = new HashMap<String, Character>();
		charMap.put("101", ' ');
		charMap.put("000000", '\'');
		charMap.put("000011", ',');
		charMap.put("10010001", '-');
		charMap.put("010001", '.');
		charMap.put("000001", '?');
		charMap.put("100101", 'A');
		charMap.put("10011010", 'B');
		charMap.put("0101", 'C');
		charMap.put("0001", 'D');
		charMap.put("110", 'E');
		charMap.put("01001", 'F');
		charMap.put("10011011", 'G');
		charMap.put("010000", 'H');
		charMap.put("0111", 'I');
		charMap.put("10011000", 'J');
		charMap.put("0110", 'K');
		charMap.put("00100", 'L');
		charMap.put("10011001", 'M');
		charMap.put("10011110", 'N');
		charMap.put("00101", 'O');
		charMap.put("111", 'P');
		charMap.put("10011111", 'Q');
		charMap.put("1000", 'R');
		charMap.put("00110", 'S');
		charMap.put("00111", 'T');
		charMap.put("10011100", 'U');
		charMap.put("10011101", 'V');
		charMap.put("000010", 'W');
		charMap.put("10010010", 'X');
		charMap.put("10010011", 'Y');
		charMap.put("10010000", 'Z');
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String str = sc.nextLine();
			int length = str.length();
			StringBuffer codeBuf = new StringBuffer();
			for (int i = 0; i < length; i++)
			{
				codeBuf.append(codeMap.get(str.charAt(i)));
			}
			length = codeBuf.length();
			for (int i = 3, j = 0; i <= length; i++)
			{
				Character a = charMap.get(codeBuf.substring(j, i));
				System.out.println(codeBuf.substring(j, i));
				if (a != null)
				{
					System.out.print(a);
					j = i;
				}
			}
			System.out.println();
		}
	}
}