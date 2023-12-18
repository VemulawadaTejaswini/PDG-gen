import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static boolean youjiu = false;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		long num[] = new long[100001];

		for (int i = 0; i < 12; i++) {
			num[i] = i+1;
		}
		if (k<12) {
			System.out.println(num[k-1]);
			return;
		}
		for (int i = 12; i < k; i++) {
			if (lastTwoDigitLessThanOne(num[i-1])) {
				num[i] = num[i-1]+1;
			} else {
				num[i] = calNew(num[i-1]);
			}
			System.out.print(num[i] + ", ");
		}
		System.out.println(num[k-1]);
	}

	private static boolean lastTwoDigitLessThanOne(long num){
		int lastOne = (int)num%10;
		int lastTow = (int)num/10%10;
		if (lastOne == 9) {
			youjiu = true;
			return false;
		}
		if (lastOne - lastTow == 1) {
			return false;
		}
		return true;
	}

	private static long calNew(long num){
		String numString = String.valueOf(num);
		int length = numString.length();
		int numIndex = length-1;
		if (youjiu) {
			for (int i = length-1; i >=0 ; i--) {
				int num2 = Character.getNumericValue(numString.charAt(i));
				if (num2 == 9) {
					numIndex--;
				} else {
					break;
				}
			}
		} else {
			for (int i = length-1; i >=1 ; i--) {
				int num1 = Character.getNumericValue(numString.charAt(i-1));
				int num2 = Character.getNumericValue(numString.charAt(i));
				if (num1+1==num2) {
					numIndex--;
				} else {
					break;
				}
			}
		}
		youjiu = false;
		if (numIndex<0) {
			return num+1;
		}

		int num3 = Character.getNumericValue(numString.charAt(numIndex));
		StringBuilder sb = new StringBuilder(numString);
		sb.setCharAt(numIndex, (char) (num3+1+'0'));
		for (int i = numIndex+1; i < length; i++) {
			if (sb.charAt(i-1) == '0' || sb.charAt(i-1)-1 < 0) {
				sb.setCharAt(i, '0');
			} else {
				sb.setCharAt(i, (char)(sb.charAt(i-1)-1));
			}
		}
		return Long.valueOf(sb.toString());
	}

}
