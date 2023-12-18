import java.util.Scanner;

public class Main {
	
	// 先日の自身の案を適切に具現化したもの

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		scanner.close();
		
		boolean emergeBlack = false;
		int initialBlackPoint = 20000;
		int endBlackPoint = 0;
		int rightInitialWhitePoint = 0;
		int whiteContinueCounter = 0;
		
		char[] c = S.toCharArray();
		
		for (int i = 0; i < N; i++) {
			if (!emergeBlack && c[i] == '#') {
				emergeBlack = true;
				initialBlackPoint = i;
				
			} else if (endBlackPoint < i && c[i-1] == '#' && c[i] == '.') {
				rightInitialWhitePoint = i;
				whiteContinueCounter++;
			} else if (i != N-1 && c[i] == '#') {
				endBlackPoint = i;
				whiteContinueCounter = 0;
			}
		}
		
		int counter = 0;
		
		if (!emergeBlack) {
			System.out.println(counter);
			return;
		}
		
		if (initialBlackPoint > rightInitialWhitePoint) {
			System.out.println(counter);
			return;
		}
		
		if (whiteContinueCounter < (endBlackPoint - initialBlackPoint + 1)) {
			for (int j = 0; j < N; j++) {
				if (initialBlackPoint <= j && c[j] == '.') {
					counter++;
				}
			}
			System.out.println(counter);
		
		} else {
			for (int j = 0; j < N; j++) {
				if (j <= initialBlackPoint && endBlackPoint <= j && c[j] == '#') {
					counter++;
				}
			}
			System.out.println(counter);
		}
		
		
		
	}

}
