import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		long num;
		long cnt = 0;

		int length = s.length();

		for (int i = 0; i < length-1; i++) {
			for (int j = i+1; j <= length; j++) {
				num = Long.parseLong(s.substring(i, j));

				if(num >= 2019l && num % 2019l == 0) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

//	static long substr(String s,long i,long j) {
//
//		String temp = null;
//
//		for (long l = i; l <= j; l++) {
//			temp += s.charAt(l);
//		}
//
//
//		return 0;
//	}


}
