import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();

		CountNumberOfConversions countNumberOfConversions = new CountNumberOfConversions();

		System.out.println(countNumberOfConversions.getReplaceCount(N,S));
	}
}

class CountNumberOfConversions {
	public int getReplaceCount(int N,String S) {
		int result = 0;
		String key = S.substring(N-1, N);
		String black =getBlack(key);
		String white =getWhite(key);
		boolean conversionFlag = false;

		String[] strArray = S.split("");
		for(String s : strArray) {
			if(!conversionFlag) {
				if(s.endsWith(black)) {
					conversionFlag = true;
				}

			}else if(conversionFlag) {
				if(s.equals(white)) {
					result++;
				}
			}
		}
		return result;
	}

	public String getBlack(String key) {
		return checkBlackOrWhite(key,"black");
	}

	public String getWhite(String key) {
		return checkBlackOrWhite(key,"white");
	}

	public String checkBlackOrWhite(String key,String input) {
		String result = ".";
		if(key.equals("#")) {
			if(input.equals("black")) {
				result="#";
			}
		}else {
			if(!input.equals("black")) {
				result="#";
			}
		}
		return result;
	}

}