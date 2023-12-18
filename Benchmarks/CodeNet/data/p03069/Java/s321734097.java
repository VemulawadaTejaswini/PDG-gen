import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = Integer.valueOf(scanner.nextLine());
		String S = scanner.nextLine();
		scanner.close();
		
		char[] c = S.toCharArray();
		int initialBlackPoint = 200000;
		int endBlackPoint = 0;
		int whiteContiCounter = 0;
		int endWhitePoint = 0;
		boolean existBlack = false;
		
		for (int i = 0; i < N; i++) {
			if (c[i] == '.') endWhitePoint = i;
			if (c[i] == '#') {
				if (!existBlack) {
					existBlack = true;
					initialBlackPoint = i;
				} else if (c[i] == '#') {
					endBlackPoint = i;
					whiteContiCounter = 0;
				} else if (c[i] == '.') {
					whiteContiCounter++;
				}
			}
		}
//		
//		System.out.println("endWhitePoint = " + endWhitePoint + ";");
//		System.out.println("initialBlackPoint = " + initialBlackPoint + ";");
//		System.out.println("endBlackPoint = " + endBlackPoint + ";");
		int counter = 0;
		if (!existBlack) {
			System.out.println(counter);
			return;
		}
		if (whiteContiCounter <= (endBlackPoint - initialBlackPoint + 1)) {
			System.out.println("do black");
			for (int j = 0; j < N; j++) {
				if (initialBlackPoint <= j && c[j] == '.') {
					counter++;
				}
			}
			System.out.println(counter);
		} else {
			if (endWhitePoint < initialBlackPoint ) {
				System.out.println(counter);
				return;
			}
			System.out.println("do white");
			for (int j = 0; j < N; j++) {
				if (j <= initialBlackPoint && endBlackPoint <= j && c[j] == '#') {
					counter++;
				}
			}
			System.out.println(counter);
			
		}
		

	}

}
