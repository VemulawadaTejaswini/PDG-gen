import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = Integer.parseInt(in.nextLine());
		int oddNum, evenNum;
		if (K % 2 == 0) {
			oddNum = K / 2;
			evenNum = K / 2;
		} else {
			oddNum = (K + 1) / 2;
			evenNum = oddNum - 1;
		}
		System.out.println(oddNum * evenNum);
		in.close();
	}
}