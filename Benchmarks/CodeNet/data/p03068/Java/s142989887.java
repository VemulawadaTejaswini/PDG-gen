import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();

		String keyItem = S.substring(K-1,K);

		System.out.println(maskIgnoreKeyWord(S,keyItem));
	}

	private static String maskIgnoreKeyWord(String input,String key) {
		String result = "";

		for(int i = 0; i < input.length() ;i++) {
			String tmp = input.substring(i, i+1);
			if(key.equals(tmp)) {
				result += tmp;
			}else {
				result +="*";
			}
		}
		return result;
	}
}