import java.util.*;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		for(int r = 0; r < num; r++) { //読み込み&分割
			StringBuilder str = new StringBuilder(stdIn.next());
			TreeSet<String> ans = new TreeSet<String>();
			for(int c = str.length() - 2; c >= 0; c--) {
				StringBuilder str1 = new StringBuilder(str.substring(0, c + 1));
				StringBuilder str2 = new StringBuilder(str.substring(c + 1));
				
				StringBuilder strbuf1 = new StringBuilder(str1.toString());
				StringBuilder strbuf2 = new StringBuilder(str2.toString());
				strbuf1.reverse();
				strbuf2.reverse();
				ans.add((str1.toString()    + str2.toString()));
				ans.add((str2.toString()    + str1.toString()));
				
				ans.add((strbuf1.toString() + str2.toString()));
				ans.add((str2.toString()    + strbuf1.toString()));
				
				ans.add((str1.toString()    + strbuf2.toString()));
				ans.add((strbuf2.toString() + str1.toString()));
				
				ans.add((strbuf1.toString() + strbuf2.toString()));
				ans.add((strbuf2.toString() + strbuf1.toString()));
			}
			System.out.println(ans.size());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}