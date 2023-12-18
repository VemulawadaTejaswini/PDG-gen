import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int res = 0;
		String s = sc.next();
		String res = "";
		boolean r = false;
		int len = s.length();



		r = isKaibun(s);

		if(r) {
			String tmp = s.substring(0, (len-1)/2 );
//			System.out.println(tmp);
			r = isKaibun(tmp);
		}
//		if(true) {
		if(r) {
			String tmp = s.substring((len+3)/2-1, len );
//			System.out.println(tmp);
			r = isKaibun(tmp);
		}

		//System.out.printf("%d\n", res);
		//System.out.printf("%d", res);
		if(r) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}


	static boolean isKaibun(String s) {
		if(s.length() <= 1) {
			return true;
		}

		if(s.charAt(0) == s.charAt(s.length()-1)) {
			if(s.length() == 2) {
				return true;
			} else {
				String tmp = s.substring(1, s.length()-1);
//				System.out.println(tmp);
				return isKaibun(tmp);
			}
		} else {
			return false;
		}

	}
}
