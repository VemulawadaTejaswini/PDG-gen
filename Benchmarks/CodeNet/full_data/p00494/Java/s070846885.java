import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int index = 0;
		int ans = 0;
		while(index < s.length()) {
			char c = s.charAt(index);
			if (c == 'O') {
				int jnum = consequtiveCharNum(s, 'J', index-1, -1);
				int onum = consequtiveCharNum(s, 'O', index, 1);
				index += onum;
				int inum = consequtiveCharNum(s, 'I', index, 1);
				index += inum;
				if(jnum >= onum && inum >= onum) {
					ans = Math.max(ans,Math.min(onum,Math.min(jnum, inum)));
				}
			}
			index++;
		}
		System.out.println(ans);
	}
	public static int consequtiveCharNum(String s,char c,int x,int v) {
		int ans = 0;
		while(0 <= x && x < s.length()) {
			if (s.charAt(x)==c) {
				ans++;
			}else{
				break;
			}
			x += v;
		}
		return ans;
	}
}