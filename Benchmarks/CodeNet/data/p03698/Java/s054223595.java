import java.util.*;
public class Main{
	static String Vari(String s){
		char[] c = new char[s.length()];
		c[0] = s.charAt(0);
		for(int i=1; i<s.length(); i++){
			c[i] = s.charAt(i);
			if(c[i-1]==c[i])return "no";
		}
		return "yes";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(Vari(S));
	}
}