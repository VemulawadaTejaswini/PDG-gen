import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		// 標準入力
		Scanner scan = new Scanner(System.in);
		String firstLine = null;
		String secondLine = null;
		
		try {
			firstLine = scan.nextLine();
			secondLine = scan.nextLine();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}

		String[] arrFirstLine = firstLine.split(" ");
		
		// 演算
		int max = 0;
		int[] arrNumber = new int[3];
		for (int i=0; i < arrFirstLine.length; i++) {
			int now = Integer.parseInt(arrFirstLine[i]);
			if (max < now) {
				max = now;
			}
			arrNumber[i] = now;
		}
		int result = 0;
		for (int i=0; i < arrNumber.length; i++) {
			if (max == arrNumber[i]) {
				result = result + (max * 2);
			} else {
				result = result + arrNumber[i];
			}
		}
		int cnt = Integer.parseInt(secondLine);
		
		// 答え
		System.out.println(cnt * result);
    }
}