package volume0;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	
	static Map<Character, Integer> roman_int = new HashMap<Character, Integer>();
	static{
		Main.roman_int.put('I', 1);
		Main.roman_int.put('V', 5);
		Main.roman_int.put('X', 10);
		Main.roman_int.put('L', 50);
		Main.roman_int.put('C', 100);
		Main.roman_int.put('D', 500);
		Main.roman_int.put('M', 1000);
	}
	
	static int toDecimal(String roman){
		char[] r = roman.toCharArray();
		int result = 0;
		
		Comparator<Character> rComperator = new Comparator<Character>(){
			
			@Override
			public int compare(Character c1, Character c2){
				int i1 = Main.roman_int.get(c1);
				int i2 = Main.roman_int.get(c2);
				if(i1 < i2)
					return -1;
				else if(i1 == i2)
					return 0;
				else
					return 1;
			}
		};
		
		char lastc = r[0];
		int temp = 0;
		for(char c: r){
			switch(rComperator.compare(lastc, c)){
				case -1:
					result += -temp;
					temp = Main.roman_int.get(c);
					break;
				case 1:
					result += temp;
					temp = Main.roman_int.get(c);
					break;
				case 0:
				default:
					temp += Main.roman_int.get(c);
			}
			lastc = c;
		}
		result += temp;
		return result;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			System.out.println(Main.toDecimal(sc.nextLine()));
		}
		sc.close();
	}
}