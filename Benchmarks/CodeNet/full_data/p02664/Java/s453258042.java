//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	static boolean[] targetNumbers;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(sc.next());
		//System.out.println(sb.charAt(1));
		for(int i=1;i<sb.length();i++) {
			if(sb.charAt(i)=='?'&&sb.charAt(i-1)=='P') {
				sb.setCharAt(i,'D');
			}if(sb.charAt(i)=='?'&&sb.charAt(i-1)=='D'){
				sb.setCharAt(i,'P');
			}
		}
		System.out.println(sb);
	}
	
}