import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		for (int i = 1; i <= n; i++) {
			String strA = br.readLine();
			String strB = br.readLine();
			int lengthA = strA.length();
			int lengthB = strB.length();
			if (lengthA > 80 || lengthB > 80) {
				System.out.println("overflow");
				continue;
			}
			int length;
			if (lengthA >= lengthB) {
				length = lengthA;
			} else {
				length = lengthB;
			}
			String[] charastrA = strA.split("", 0);
			String[] charastrB = strB.split("", 0);
			Reverse(charastrA);
			Reverse(charastrB);
			int[] charaA = new int[length + 1];
			int[] charaB = new int[length + 1];
			for (int j = 0; j < lengthA; j++) {
				charaA[j] = Integer.parseInt(charastrA[j]);
			}
			for (int j = 0; j < lengthB; j++) {
				charaB[j] = Integer.parseInt(charastrB[j]);
			}
			int[] sum = new int[length + 1];
			for (int k = 0; k <= length; k++) {
				if (charaA[k] + charaB[k] >= 10) {
					sum[k] = charaA[k] + charaB[k] - 10;
					charaA[k + 1]++;
				} else {
					sum[k] = charaA[k] + charaB[k];
				}
			}
			if (sum.length == 81 && sum[length] != 0) {
				System.out.println("overflow");
			}
			Boolean isHeadZero = true;
			for (int l = 0; l <= length; l++) {
				if (isHeadZero) {
					if (sum[length - l] == 0) {
						continue;
					} else {
						isHeadZero = false;
					}
				}
				System.out.print(sum[length - l]);
			}
			System.out.println();
		}
	}

	public static void Reverse(String[] num) {
		int length = num.length;
		for (int i = 0; i <= length / 2; i++) {
			int j = length - i - 1;
			if (i >= j) {
				break;
			}
			String temporary = num[i];
			num[i] = num[j];
			num[j] = temporary;

		}
	}
}