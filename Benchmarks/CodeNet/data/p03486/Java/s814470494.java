import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		char[] s' = s.toCharArray();
		char[] t' = t.toCharArray();
		Arrays.sort(s');
		Arrays.sort(t');
		t'[0]=t'[t'.length-1];
		String S = String.valueOf(s');
		String T = String.valueOf(t');
		if(S.compareTo(T)<0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
 
}