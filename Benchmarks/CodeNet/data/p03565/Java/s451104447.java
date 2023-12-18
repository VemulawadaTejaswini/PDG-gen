import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] T = sc.nextLine().toCharArray();
		sc.close();
		String result = "UNRESTORABLE";
		int indexS = 0;
		if (T.length <= S.length()) {
			boolean stopFlag = false;
			for (int i = 0; i < T.length; i++) {
				while (indexS >= 0) {
					if (indexS == 0) {
						indexS = S.indexOf(T[i], indexS);
					} else {
						indexS = S.indexOf(T[i], indexS + 1);
					}
					
					if (S.length() - (indexS + 1) >= (T.length - (i + 1))
							&& indexS >= i) {
						boolean isTarget = true;
						int count = indexS;
						for (int j = i; j < T.length; j++) {
							if (S.charAt(count) != T[j] && S.charAt(count) != '?') {
								isTarget = false;
								break;
							}
							count++;
						}
						if (isTarget) {
							count = indexS - i;
							for (int j = 0; j < i; j++) {
								if (S.charAt(count) != T[j] && S.charAt(count) != '?') {
									isTarget = false;
									break;
								}
							}
							count++;
						} else {
							continue;
						}
						
						if (isTarget) {
							StringBuilder sb = new StringBuilder();
							for (int k = 0; k < S.length(); k++) {
								if (k == (indexS - i)) {
									sb.append(T);
									k += T.length - 1;
//								} else if (S.charAt(k) == '?') {
//									sb.append('a');
								} else {
									sb.append(S.charAt(k));
								}
							}
							result = sb.toString();
							S = sb.toString();
//							stopFlag = true;
							break;
						}
					}
				}
//				if (stopFlag) {
//					break;
//				}
			}
		}
		System.out.println(result);
		System.out.println(result.replaceAll("\\?", "a"));
	}
}