import java.util.*;

// AGC 22-A
// https://beta.atcoder.jp/contests/agc022

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char[] S = in.next().toCharArray();
		char[] T = in.next().toCharArray();
		
		ArrayList<String> answers = new ArrayList<String>();
		
		for (int i = S.length - 1; i >= 0; i--) {
			if (i < T.length - 1) {
				continue;
			}
			char[] potentialAnswer = S.clone();
			
			for (int j = S.length - 1; j > i; j--) {
				if (potentialAnswer[j] == '?') {
					potentialAnswer[j] = 'a';
				}
			}
			
			boolean isPotentialAnswer = true;
			
			for (int j = T.length - 1; isPotentialAnswer && j >= 0; j--) {
				int potentialAnswerIndex = i - (T.length - 1 - j);
				
				if (potentialAnswer[potentialAnswerIndex] == '?' || potentialAnswer[potentialAnswerIndex] == T[j]) {
					potentialAnswer[potentialAnswerIndex] = T[j];
				} else {
					isPotentialAnswer = false;
				}
			}
			
			for (int j = 0; j < i - (T.length); j++) {
				if (potentialAnswer[j] == '?') {
					potentialAnswer[j] = 'a';
				}
			}
			
			if (isPotentialAnswer) {
				answers.add(new String(potentialAnswer));
			}
		}
		
		answers.sort(null);
		
		if (answers.size() > 0) {
			System.out.println(answers.get(0));
		} else {
			System.out.println("UNRESTORABLE");
		}
	}
}