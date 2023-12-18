import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ATGC = {'A','T','G','C'};
		String s = sc.next();
		int maxlen = 0;
		int len = 0;
		for(int i = 0;i < s.length();i ++) {
			char c = s.charAt(i);
			boolean ATGCis = false;
			for(int k = 0;k < 4;k ++) {
				if(c == ATGC[k]) ATGCis = true;
			}
			if(!ATGCis) {
				if(maxlen < len) {maxlen = len; len = 0;}
				else len = 0;
			}
			else len ++;
		}
		System.out.println(maxlen);
	}
}