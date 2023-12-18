import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char alphabetfirst = 'a';
		char alphabetlast = 'z';
		boolean flg = true; 
		boolean zFlg = false; 
		int num = 0;
		int val = 0;
		char[] c = new char[s.length()];
		for(int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		if(s == "abcdefghijklmnopqrstuvwxyz") flg = false;
		for(int r = 0; r < c.length -1; r++) {
			if (c[r] != alphabetlast) {
				flg = false;
				break;
			}
			alphabetlast--;
			val++;
		}
		if(flg) {
			System.out.println("-1");
		}else {
			for(int k = 0; k < c.length -1; k++) {
				if(c[k] != alphabetfirst) {
				 if(c[k] == 'z'){
					zFlg = true;
				 }
					break;
				}
				alphabetfirst++;
				num++;
				
 			}
			if(num == c.length -1) {
			System.out.println(s.substring(0, num+1) + (char)(s.charAt(num)+1));
			}else if(s.startsWith("z")) {
			System.out.println(s.substring(0, val) + (char)(s.charAt(val)+1));
			}else if(zFlg) {
			System.out.println(s.substring(0, num-1) + (char)(s.charAt(num-1)+1));	
			}else {
			System.out.println(s + (char)(s.charAt(num-1)+1));
			}
		}
	}

}