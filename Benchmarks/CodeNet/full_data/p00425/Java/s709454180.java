import java.util.Scanner;
public class Main {
	static int cu = 1;
	static int cd = 6;
	static int n =  5;
	static int s =  2;
	static int e = 4;
	static int w = 3;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int k = stdIn.nextInt();
			if(k == 0) {
				break;
			}
			cu = 1;
			cd = 6;
			n =  5;
			s =  2;
			e = 4;
			w = 3;
			
			int ans = 1;
			for(int i = 0; i < k; i++) {
				String tmp = stdIn.next();
				if (tmp.equals("North")) {
					north();
				}
				if (tmp.equals("South")) {
					south();
				}
				if (tmp.equals("East")) {
					east();
				}
				if (tmp.equals("West")) {
					west();
				}
				if (tmp.equals("Right")) {
					right();
				}
				if (tmp.equals("Left")) {
					left();
				}
				ans += cu;
			}
			System.out.println(ans);
		}
	}
	
	static void north() {
		int tmp = cu;
		cu = s;
		s = cd;
		cd = n;
		n = tmp;
	}
	static void south() {
		int tmp = cu;
		cu = n;
		n = cd;
		cd = s;
		s = tmp;
	}
	static void east() {
		int tmp = cu;
		cu = e;
		e = cd;
		cd = w;
		w = tmp;
	}
	static void west() {
		int tmp = cu;
		cu = w;
		w = cd;
		cd = e;
		e = tmp;
	}
	static void right() {
		int tmp = n;
		n = e;
		e = s;
		s = w;
		w = tmp;
	}
	static void left() {
		int tmp = n;
		n = w;
		w = s;
		s = e;
		e = tmp;
	}
}