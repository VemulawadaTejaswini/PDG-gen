import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// メソッドごとのテスト
//		String str = "abcde";
//		// 置換
//		System.out.println(replace(str, "xyz", 1, 3)); // OK
//		// 反転
//		// cbade
//		System.out.println(reverse(str, 0, 2)); //

		String str = sc.next();
		Integer q = sc.nextInt();
		for(int i=0; i<q; i++) {
			String func = sc.next();
			if(func.equals("replace")) {
				Integer arg1 = sc.nextInt();
				Integer arg2 = sc.nextInt();
				String arg3 = sc.next();
				str = replace(str, arg3, arg1, arg2);
			} else if(func.equals("reverse")) {
				Integer arg1 = sc.nextInt();
				Integer arg2 = sc.nextInt();
				str = reverse(str, arg1, arg2);
			} else if(func.equals("print")) {
				Integer arg1 = sc.nextInt();
				Integer arg2 = sc.nextInt();
				print(str, arg1, arg2);
			}
		}

		sc.close();


	}

	private static void print(String str, Integer start, Integer end) {
		System.out.println(str.substring(start, end + 1));
	}

	private static String reverse(String str, Integer start, Integer end) {
		StringBuffer sb = new StringBuffer(str);
		String reverseStr = sb.substring(start, end);
		StringBuffer reversedStrSb = new StringBuffer(reverseStr);
		reversedStrSb.reverse();
		sb.replace(start, end, reversedStrSb.toString());
//        String ret = sb.reverse().toString();
        return sb.toString();
	}

	private static String replace(String str, String replaceStr, Integer start, Integer end) {
		StringBuffer sb = new StringBuffer(str);
		sb.replace(start, end, replaceStr);
		String ret = sb.toString();
		return ret;
	}


}
