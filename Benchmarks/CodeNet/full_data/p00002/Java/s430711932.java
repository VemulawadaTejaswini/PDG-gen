public class Main{
public static void sumOfDigits(int a, int b) {
		int digitsOfA = 0;
		int digitsOfB = 0;
		if (a >= 0) {
			digitsOfA = Integer.valueOf(a).toString().length();
		}
		if (b >= 0) {
			digitsOfB = Integer.valueOf(b).toString().length();
		}
		int sumOfDigits = digitsOfA + digitsOfB;
		System.out.println(sumOfDigits);
	}
}