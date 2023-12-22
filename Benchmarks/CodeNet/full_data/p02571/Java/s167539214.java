import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		char[] cs = new char[s.length()];
		char[] ct = new char[t.length()];
		boolean[] count = new boolean[1001];
		int max = 0;
		
		for(int i=0;i<s.length();i++) {
			cs[i] = s.charAt(i);
		}
		
		for(int i=0;i<t.length();i++) {
			ct[i] = t.charAt(i);
		}
		
		for(int i=0;i<=s.length()-t.length();i++) {
			int n = 0;
			for(int j=0;j<t.length();j++) {
				if(cs[i+j] == ct[j]) {
					n++;
				}
			}
			max = Math.max(max, n);
			count[n] = true;
		}
		
		System.out.println(t.length()-max);

	}

}