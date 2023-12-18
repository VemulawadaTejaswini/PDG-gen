import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		String ans = "NA";
		int first = N / 100;
		int second = N % 100;
		if (isMM(first) && isMM(second)) {
			ans = "AMBIGUOUS";
		} else if (isMM(first)) {
			ans = "MMYY";
		} else if (isMM(second)) {
			ans = "YYMM";
		}

		System.out.println(ans);





		reader.close();

	}
	static boolean isMM(int num) {
		return num >= 1 && num <= 12;
	}

}
