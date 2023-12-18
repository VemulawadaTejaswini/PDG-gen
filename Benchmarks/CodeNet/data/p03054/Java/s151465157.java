
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int high = sc.nextInt();
		int wide = sc.nextInt();
		char[] first = sc.next().toCharArray();
		char[] second = sc.next().toCharArray();
		int bu = high, bd = high, bl = wide, br = wide;
		boolean getkoma = false;
		for(int i = 0; i < N; i++) {
			switch (first[i]) {
			case 'U':
				bu--;
				if(bu < 1) {
					getkoma = true;
				}
				break;
			case 'D':
				bd++;
				if(bd > H) {
					getkoma = true;
				}
				break;
			case 'L':
				bl--;
				if(bl < 1) {
					getkoma = true;
				}
				break;
			case 'R':
				br++;
				if(br > W) {
					getkoma = true;
				}
				break;
			}
			if(getkoma) {
				break;
			}
			switch (second[i]) {
			case 'U':
				if(bu < H) {
					bu++;
				}
				break;
			case 'D':
				if(bd > 1) {
					bd--;
				}
				break;
			case 'L':
				if(bl < W) {
					bl++;
				}
				break;
			case 'R':
				if(br > 1) {
					br--;
				}
				break;
			}
		}
		if(getkoma) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}

}
