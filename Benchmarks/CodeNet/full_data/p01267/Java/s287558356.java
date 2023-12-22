import java.util.*;
public class Main {
	static char[] l = new char[] {'q','w','e','r','t','a','s','d','f','g','z','x','c','v','b'};
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			int x = stdIn.nextInt();
			if(a == 0 && b == 0 && c == 0 && n == 0 && x == 0) break;
			int counter = 0;
			for(int i = 0; i < n; i++) {
				int y = stdIn.nextInt();
				if(y == x && i == 0) continue;
				while(counter <= 10000) {
					x = chek(a,b,c,x);
					counter++;
					if(y == x) {
						break;
					}

				}
			}
			System.out.println((counter > 10000)?"-1":counter);
			
			
		}
	}
	public static int chek(int a, int b, int c, int xd) {
		return (a * xd + b)%c;
	}
}