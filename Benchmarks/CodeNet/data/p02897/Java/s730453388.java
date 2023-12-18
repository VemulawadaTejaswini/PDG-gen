
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String ans = "";
		if(a == 0 && w == 1) {
			for(int i = 0; i < b; i++) {
				ans += "1\n";
			}
			for(int i = b; i < h; i++) {
				ans += "0\n";
			}
		} else if(b == 0 && h == 1) {
			for(int i = 0; i < a; i++) {
				ans += "1";
			}
			for(int i = a; i < w; i++) {
				ans += "0";
			}
			ans += "\n";
		} else {
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(i < a && j < b) {
						ans += "0";
					} else if(j < b) {
						ans += "1";
					} else if(i < a) {
						ans += "1";
					} else {
						ans += "0";
					}
				}
				ans += "\n";
			}
		}
		System.out.println(ans);
	}

}
