import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.nextLine().toCharArray();
		char[] t = sc.nextLine().toCharArray();
		int   sl = s.length;
		int   tl = t.length;

		int max  = 0;

		for(int i = 0; i < sl - tl + 1; i ++) {

			int cnt = 0;

			for(int j = 0; j < tl; j++) {

				if(s[i + j] == t[j])cnt++;
			}

			max = Math.max(max, cnt);
		}


		System.out.println(tl - max);
	}
}
