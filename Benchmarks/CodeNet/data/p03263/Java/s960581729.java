
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		boolean flag = false;
		int high = 0;
		int wide = 0;
		long hcount = 0;
		long wcount = 0;
		long count = 0;
		String ans = "";
		String move = "";
		for(int i = 1; i < h + 1; i++) {
			if(flag) {
				int tmp = h + 1;
				move += h + " " + wide + " " + tmp + " " + wide + "\n";
				hcount++;
			}
			for(int j = 1; j < w + 1; j++) {
				int tmp = sc.nextInt();
				if(tmp % 2 != 0) {
					if(flag) {
						high = i;
						wide = j;
						flag = true;
					} else {
						if(wide < j) {
							for(int k = wide; k < j; k++) {
								int l = k + 1;
								move += i + " " + k + " " + i + " " + l + "\n";
								wcount++;
							}
						} else if(wide > j) {
							for(int k = wide; k > j; k--) {
								int l = k - 1;
								move += i + " " + k + " " + i + " " + l + "\n";
								wcount++;
							}
						}
						count += hcount + wcount;
						hcount = 0;
						wcount = 0;
						ans += move;
						move = "";
						flag = false;
					}
				}
			}
			System.out.println(count + "\n" + ans);
		}
	}
}