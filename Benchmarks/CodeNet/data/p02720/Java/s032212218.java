import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			int k = sc.nextInt();

			int headNum = 1;			
			int digit = 1;

			while (true) {

				findRun(headNum, digit, new StringBuilder(), k);

				if ( count < k ) {
					if ( headNum == 9 ) {
						headNum = 1;
						digit++;
					}
					else {
						headNum++;
					}
				}
				else {
					break;
				}
			}
		}
	}
	
	private static int count = 0;
	
	private static void findRun(int headNum, int digit, StringBuilder sb, int k) {
		sb.append(headNum);
		
		if ( digit == 1 ) {
			count++;
			if ( count == k ) {
				System.out.println(sb.toString());
			}
			return;
		}

		if ( headNum > 0 ) {
			findRun(headNum-1,digit-1, new StringBuilder(sb), k);
		}
		
		findRun(headNum, digit-1, new StringBuilder(sb), k);

		if ( headNum < 9 ) {
			findRun(headNum+1, digit-1, new StringBuilder(sb), k);
		}

	}

}