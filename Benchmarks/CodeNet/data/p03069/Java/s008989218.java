import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char before = s.charAt(0);
		int changecnt = 0,blackcnt = 0,whitecnt = 0;
		boolean blackis = false;
		for(int i = 0;i < n;i ++) {
			char c = s.charAt(i);
			if(c == '#') { blackcnt++; blackis = true;}
			if(blackis && c == '.') whitecnt++;
		}
		if(blackcnt < whitecnt) System.out.println(blackcnt);
		else System.out.println(whitecnt);
	}
}
