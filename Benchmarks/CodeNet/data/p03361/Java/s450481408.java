import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		String[] table = new String[h];
		for(int i = 0; i < h; i++) {
			table[i] = sc.next();
		}

		// 確認
		String ans = "Yes";
		boolean flg = false;
		for(int i = 0; i < h; i++) {

			boolean befflg = false;
			for(int j = 0; j < w; j++) {
				if(table[i].charAt(j) == '.') {
					befflg = false;
					continue;
				}

				if(befflg == true) {
					continue;
				}

				flg = false;
				if(i != 0 && table[i-1].charAt(j) == '#') {
					flg = true;
				}
				if(i != h-1 && table[i+1].charAt(j) == '#') {
					flg = true;
				}
				if(j != 0 && table[i].charAt(j-1) == '#') {
					flg = true;
				}
				if(j != w-1 && table[i].charAt(j+1) == '#') {
					flg = true;
				}

				if(flg == false) {
					ans = "No";
					break;
				}
			}
			if(flg == false) {
				break;
			}
		}

		System.out.println(ans);

	}
}
