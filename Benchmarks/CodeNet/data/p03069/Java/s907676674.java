import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int blackcnt = 0,whitecnt = 0;
		boolean blackis = false;
		for(int i = 0;i < n;i ++) {
			char c = s.charAt(i);
			if(c == '#' && (i != n-1)) { blackcnt++; blackis = true;}
			if(blackis && c == '.') whitecnt++;
		}
		if(blackcnt < whitecnt) System.out.println(blackcnt);
		else System.out.println(whitecnt);
	}
}