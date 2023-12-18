import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0 ; i < s.length() ; i += 2) {
			sb.append(s.substring(i, i+1));
		}
		System.out.println(sb.toString());
		return;
	}
}
