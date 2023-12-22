import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = 2*Integer.parseInt(br.readLine().trim());

		String[] s = new String[N];
		for (int i = 0 ; i < N ; i++) {
			s[i] = (new StringBuilder(br.readLine().trim())).reverse().toString();
		}
		for (int i = 0 ; i < N ; i+=2) {
			String A, B;
			if (s[i].length() < s[i+1].length()) {
				A = s[i+1]; B = s[i];
			} else {
				A = s[i]; B=s[i+1];
			}
			StringBuilder sb = new StringBuilder(B);
			for (int j = 0 ; j < A.length()-B.length() ; j++) sb.append("0");
			B = sb.append("0").toString();
			A = A + "0";

			int[] As = new int[A.length()], Bs = new int[A.length()];
			for (int j = 0 ; j < A.length() ; j++) {
				As[j] = A.charAt(j)-48; Bs[j] = B.charAt(j)-48;
			}

			for (int j = 0 ; j < A.length()-1 ; j++) {
				As[j] += Bs[j];
				if (As[j] > 9) {
					As[j] -= 10; As[j+1]++;
				}
			}

			sb = new StringBuilder();
			for (int j = 0 ; j < A.length() ; j++) sb.append((char)(As[j]+48));
			sb.reverse();
			if (sb.charAt(0) == '0') sb.deleteCharAt(0);
			String S = sb.toString();

			if (S.length() > 80) System.out.println("overflow");
			else System.out.println(""+sb.toString());

		}

	}
}