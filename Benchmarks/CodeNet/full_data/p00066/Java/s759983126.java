import java.util.Scanner;

public class Main {

	public static int[] linea = {0,1,2,0,3,6,0,2};
	public static int[] lined = {3,3,3,1,1,1,4,2};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			char win = 'd';
			for(int i=0;i<8;i++) {
				char c = checkWin(s, linea[i], lined[i]);
				if (c != 'd' && c != 's') {
					win = c;
					break;
				}
			}
			System.out.println(win);
		}
	}

	public static char checkWin(String s,int a,int d) {
		char c = s.charAt(a);
		for(int i=1;i<3;i++) {
			char c2 = s.charAt(a+d*i);
			if (c != c2) {
				return 'd';
			}
		}
		return c;
	}
}