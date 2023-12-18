import java.util.*;

public class Main {

	static int n;
	static boolean isFound;
	static char[] answer;
	static char[] arr;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		String s = in.next();
		arr = s.toCharArray();
		
		answer = new char[n];
		
		boolean isDone = false;
		
		answer[0] = 'S';
		answer[1] = 'S';
		fill(1);
		if (isConsistent()) {
			isDone = true;
			for (int i = 0; i < n; i++) {
				System.out.printf("%c", answer[i]);
			}
		}
		
		if (!isDone) {
			answer[0] = 'S';
			answer[1] = 'W';
			fill(1);
			if (isConsistent()) {
				isDone = true;
				for (int i = 0; i < n; i++) {
					System.out.printf("%c", answer[i]);
				}
			}
		}
		
		if (!isDone) {
			answer[0] = 'W';
			answer[1] = 'W';
			fill(1);
			if (isConsistent()) {
				isDone = true;
				for (int i = 0; i < n; i++) {
					System.out.printf("%c", answer[i]);
				}
			}
		}

		if (!isDone) {
			answer[0] = 'W';
			answer[1] = 'S';
			fill(1);
			if (isConsistent()) {
				isDone = true;
				for (int i = 0; i < n; i++) {
					System.out.printf("%c", answer[i]);
				}
			}
		}
		
		if (!isDone) {
			System.out.println(-1);
		}
	}
	
	public static void fill(int index) {
		if (index == n - 1) {
			return;
		}
		if (answer[index] == 'S') {
			if (arr[index] == 'o') {
				answer[index + 1] = answer[index - 1];
			} else if (arr[index] == 'x') {
				answer[index + 1] = answer[index - 1] == 'S' ? 'W' : 'S';
			}
		} else {
			if (arr[index] == 'o') {
				answer[index + 1] = answer[index - 1] == 'S' ? 'W' : 'S';
			} else if (arr[index] == 'x') {
				answer[index + 1] = answer[index - 1];
			}
		}
		
		fill(index + 1);
	}
	
	public static boolean isConsistent() {
		int pre, post;
		for (int i = 0; i < n; i++) {
			pre = i == 0 ? n - 1 : i - 1;
			post = i == n - 1 ? 0 : i + 1;
			// pre and post must match
			if ((answer[i] == 'S' && arr[i] == 'o') || (answer[i] == 'W' && arr[i] == 'x')) {
				if (answer[pre] != answer[post]) return false;
			}
			// pre and post must be different
			if ((answer[i] == 'S' && arr[i] == 'x') || (answer[i] == 'W' && arr[i] == 'o')) {
				if (answer[pre] == answer[post]) return false;
			}
		}
		return true;
	}
}