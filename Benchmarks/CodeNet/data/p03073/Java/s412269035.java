import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String alt = "",_alt= "";
		for(int i = 0;i < n.length();i ++) {
			if(i % 2 == 0) {
				alt += "0"; _alt += "1";
			}else {
				alt += "1"; _alt += "0";
			}
		}
		char altc,_altc,nc;
		int altcnt = 0, _altcnt = 0;
		for(int i = 0;i < n.length();i ++) {
			altc = alt.charAt(i);
			_altc = _alt.charAt(i);
			nc = n.charAt(i);
			if(altc != nc) altcnt++;
			if(_altc != nc) _altcnt++;
		}
		if(altcnt < _altcnt) System.out.println(altcnt);
		else System.out.println(_altcnt);
	}
}