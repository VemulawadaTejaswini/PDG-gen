import java.util.*;
public class Main{
	static String Rort(String s, String t){
		String ss = s + s;
		ss = ss.replaceFirst(t, "");
		if(ss.equals(s))return "Yes";
		return "No";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		System.out.println(Rort(S, T));
	}
}