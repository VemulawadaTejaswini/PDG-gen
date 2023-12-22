import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] map = new int[200001];
		map[0] = 0;
		map[1] = 1;
		for (int i = 2; i < 200001; i++) {
			int temp = i % countOne(i);
			if (temp == 0) {
				map[i] = 1;
			} else {
				map[i] = map[temp]+1;
			}
		}

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		String n = sc.next();

		char[] array = n.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length;i++) {
			if (array[i] == '1') {
				count++;
			}
		}

		for (int i = 0; i < array.length;i++) {
			String string = null;
			int newCount = count;
			char[] newArray = Arrays.copyOf(array, array.length);
			if (array[i] == '1') {
				newArray[i] = '0';
				string = String.valueOf(newArray);
				newCount-=1;
			} else {
				newArray[i] = '1';
				string = String.valueOf(newArray);
				newCount+=1;
			}

			System.out.println(map[binaryMod(string, newCount)]+1);
		}

	}

	private static int countOne(int i) {
		String array = Integer.toBinaryString(i);
		int count = 0;
		for (int j = 0; j < array.length(); j++) {
			if (array.charAt(j) == '1') {
				count++;
			}
		}
		return count;
	}

	private static int binaryMod(String binaryString, int mod) {
		if (mod == 0) {
			return -1;
		}
		int temp = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			temp = temp % mod;
			temp = (temp * 2) + Integer.valueOf(String.valueOf(binaryString.charAt(i)));
		}
		return temp % mod;
	}

}
