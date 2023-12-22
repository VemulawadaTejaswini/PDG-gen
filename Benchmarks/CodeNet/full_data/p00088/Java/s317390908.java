import java.util.*;
import java.io.*;

public class Main{
	public static void solve(String str){
		StringBuilder temp = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			switch( str.charAt(i) ){
				case ' ' : temp.append("101"); break;
				case '\'' : temp.append("000000"); break;
				case ',' : temp.append("000011"); break;
				case '-' : temp.append("10010001"); break;
				case '.' : temp.append("010001"); break;
				case '?' : temp.append("000001"); break;
				case 'A' : temp.append("100101"); break;
				case 'B' : temp.append("10011010"); break;
				case 'C' : temp.append("0101"); break;
				case 'D' : temp.append("0001"); break;
				case 'E' : temp.append("110"); break;
				case 'F' : temp.append("01001"); break;
				case 'G' : temp.append("10011011"); break;
				case 'H' : temp.append("010000"); break;
				case 'I' : temp.append("0111"); break;
				case 'J' : temp.append("10011000"); break;
				case 'K' : temp.append("0110"); break;
				case 'L' : temp.append("00100"); break;
				case 'M' : temp.append("10011001"); break;
				case 'N' : temp.append("10011110"); break;
				case 'O' : temp.append("00101"); break;
				case 'P' : temp.append("111"); break;
				case 'Q' : temp.append("10011111"); break;
				case 'R' : temp.append("1000"); break;
				case 'S' : temp.append("00110"); break;
				case 'T' : temp.append("00111"); break;
				case 'U' : temp.append("10011100"); break;
				case 'V' : temp.append("10011101"); break;
				case 'W' : temp.append("000010"); break;
				case 'X' : temp.append("10010010"); break;
				case 'Y' : temp.append("10010011"); break;
				case 'Z' : temp.append("10010000"); break;
			}
		}
		while( temp.length()%5 != 0 ){
			temp.append("0");
		}
		String s = new String(temp);
		
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < s.length()/5; i++){
			int x = Integer.parseInt(s.substring(i*5, i*5+5),2);
			if( x < 26 ){
				ans.append(Character.toString((char)('A'+x)));
			} else {
				switch( x ){
					case 26: ans.append(" "); break;
					case 27: ans.append("."); break;
					case 28: ans.append(","); break;
					case 29: ans.append("-"); break;
					case 30: ans.append("'"); break;
					case 31: ans.append("?"); break;
				}
			}
		}
		System.out.println(ans);
	}
			
	public static void main(String[] args){
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));		
			while( stdIn.hasNext() ){
				String str = stdIn.nextLine();
				solve(str);		
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}