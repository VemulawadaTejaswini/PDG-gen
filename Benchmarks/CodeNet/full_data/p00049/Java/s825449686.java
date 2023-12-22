import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[4];
		while(sc.hasNext()) {
			String[] s = sc.next().split(",");
			if(s[1].length() == 2) {
				cnt[2]++;
			}else {
				char c = s[0].charAt(0);
				if(c == 'A') {
					cnt[0]++;
				}else if(c == 'B') {
					cnt[1]++;
				}else {
					cnt[3]++;
				}
			}
		}
		sc.close();

	}
}
