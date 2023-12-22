import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String[] s = new String[3];
			s[0] = sc.next();
			if (s[0].equals("0")) {
				break;
			}
			for(int i=1;i<3;i++) {
				s[i] = sc.next();
			}
			char[][] map = new char[3][];
			for(int i=0;i<3;i++) {
				map[i] = s[i].toCharArray();
			}
			char c = win(map);
			System.out.println(c == '+' ? "NA" : c);
		}
	}

	public static char win(char[][] map) {
		for(int i=0;i<3;i++) {
			char c = win(map,i,0,0,1);
			if (c != '+') {
				return c;
			}
			c = win(map,0,i,1,0);
			if (c != '+') {
				return c;
			}
		}
		char c = win(map,0,0,1,1);
		if (c != '+') {
			return c;
		}
		return win(map,0,2,1,-1);
	}
	public static char win(char[][] map,int si,int sj,int di,int dj) {
		char c = map[si][sj];
		if (c == '+') {
			return '+';
		}
		for(int i=1;i<3;i++) {
			si += di;
			sj += dj;
			if (map[si][sj] != c) {
				return '+';
			}
		}
		return c;
	}

}