import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mVal = N;
		int sN = 0;
		while (mVal != 0) {
			sN += mVal % 10;
			mVal = mVal / 10;
		}
		if (N % sN == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}