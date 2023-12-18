import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		Boolean flg = false;
		int count = 0;

		StringBuilder sb = new StringBuilder(N);

		for(int i = 0; i < S.length(); i++) {
			char tmp = S.charAt(i);
			if(tmp == '#') {
				flg = true;
			}
			if(flg == true && tmp == '.') {
				count++;
			}
		}
		System.out.println(count);
	}
}