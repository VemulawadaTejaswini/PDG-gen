import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static ArrayList<Integer> list;
	static ArrayList<Integer> listA;
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int b = stdIn.nextInt();
			int r = stdIn.nextInt();
			int g = stdIn.nextInt();
			int c = stdIn.nextInt();
			int s = stdIn.nextInt();
			int t = stdIn.nextInt();
			
			if( b == 0 && r == 0 && g == 0 && c == 0 && s == 0 && t == 0) {
				break;
			}
			int ans = 100;
			ans -= t*3;
			ans += s*3;
			ans += c*2;
			ans += g*7;
			ans += (r)*16*3;
			ans += r*15;
			ans += (b)*16*5;
			ans += b*15;
			
			System.out.println(ans);
		}
	}
}