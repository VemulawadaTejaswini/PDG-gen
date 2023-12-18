import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String s,t;
		s = sc.next();
		t = sc.next();
		sc.close();
		String ans = "";
		int n = t.length();
		int n2 = s.length();
		int bm[] = new int[27];
		for(int i = 0; i < 27; ++i) {
			bm[i] = n;
		}
		
		for(int i = 0; i < n; ++i) {
			int tmp = (int)(t.charAt(i) - 'a');
			bm[tmp] = n - i - 1;
		}
		
		int i = n - 1, j = i;
		while(i < n2 && j >= 0) {
			if(s.charAt(i) != t.charAt(j) && s.charAt(i) != '?') {
				int tmp = (int)(s.charAt(i) - 'a');
				if(bm[tmp] > n - j) {
					i += n - j;
					j = n - 1;
				}
				else {
					i += bm[tmp];
					j = n - 1;
				}
			}
			else {
				i--;
				j--;
			}
		}
		if(j < 0) {
			String tmp = "";
			for(int k = 0; k < i + 1; ++k)tmp += s.charAt(k);
			for(int k = 0; k < n; ++k)
					tmp += t.charAt(k);
			//System.out.println(tmp);
			s = tmp.substring(0);
			//System.out.println(s + "/");
			tmp = "";
			for(int k = 0; k < n2; ++k) {
				if(s.charAt(k) == '?')tmp += 'a';
				else tmp += s.charAt(k);
			}
			System.out.println(tmp);
		}
		else 
			System.out.println("UNRESTORABLE");
	}

}
