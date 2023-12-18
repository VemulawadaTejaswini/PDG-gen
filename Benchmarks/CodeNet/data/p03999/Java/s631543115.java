import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long res = 0;
		sc.close();
		System.out.println(sum(res,S));
	}

	private static long sum(long res, String s) {
		long num = 0;
		long snum = Long.parseLong(s);
		for(int i = 0;i < s.length();i++) {
			if(i == 0) {
				num = res + snum;
			}else {
				num += sum(res+Long.parseLong(s.substring(0,i)),s.substring(i,s.length()));
			}
		}
		return num;
	}
}