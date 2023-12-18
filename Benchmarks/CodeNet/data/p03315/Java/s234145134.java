import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int digit = 1;
		int count = 10;



		while(k > 0) {		
			int baseNineNum = 0;
			for (int i = 1; i < digit; i++) {
				if (fanc(makeCheckNum(baseNineNum,digit)) > fanc(makeCheckNum(i, digit))) {
					baseNineNum = i;
				}
			}
			count = (int)Math.pow(10 , digit - baseNineNum - 1);
			while(count < (int)Math.pow(10 , digit - baseNineNum)) {
				System.out.println(count + makeNineStr(baseNineNum));
				count++;
				k--;
				if (k <= 0) {
					break;
				}
			}
			digit++;
		}
	}

	public static double fanc(long x) {
		return (double)x/numStrSum(x);
	}

	public static long numStrSum(long x) {
		if (x < 10) {
			return x;
		} else {
			return numStrSum(x/10) + x % 10;
		}
	}

	public static String makeZeroStr(int x) {
		String str = "";
		for (int i = 0 ; i < x; i++) {
			str = str + "0";
		}
		return str;
	}
	public static  String makeNineStr(int x) {
		String str = "";
		for (int i = 0 ; i < x; i++) {
			str = str + "9";
		}
		return str;
	}

	public static long makeCheckNum(int i, int digit) {
		return Long.parseLong("1" + makeZeroStr(digit - i - 1) + makeNineStr(i));
	}
}