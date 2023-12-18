import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int A = Integer.parseInt(tokens[1]);
		int B = Integer.parseInt(tokens[2]);
		int C = Integer.parseInt(tokens[3]);
		int D = Integer.parseInt(tokens[4]);
		String S = in.readLine();
		if (D > C) {
			// 移動できればよい
			int type = check(S, Math.min(A, B) - 1, Math.max(C, D));
			if (type >= 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			int typeA = check(S, A - 1, C);
			int typeB = check(S, B - 1, D);
			int typeC = check(S, B - 1, D);
			if(typeA < 0 || typeB < 0) {
				// 移動できない
				System.out.println("No");
			}else {
				if(typeC > 0) {
					// 抜かせる
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
		in.close();
	}

	static int check(String S, int start, int end) {
		int whiteSeqNum = 0;
		int blackSeqNum = 0;
		int maxWhiteSeqNum = 0;
		int maxBlackSeqNum = 0;
		for (int i = start; i < end; ++i) {
			if (S.charAt(i) == '.') {
				++whiteSeqNum;
				maxWhiteSeqNum = Math.max(maxWhiteSeqNum, whiteSeqNum);
				blackSeqNum = 0;
			} else {
				++blackSeqNum;
				maxBlackSeqNum = Math.max(maxBlackSeqNum, blackSeqNum);
				whiteSeqNum = 0;
			}
		}
		if (maxBlackSeqNum >= 2) {
			return -1;
		} else if (maxWhiteSeqNum <= 2) {
			return 0;
		} else {
			return 1;
		}

	}

}