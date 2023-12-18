import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		String str = scanner.next();
		String[] strArray = str.split("");
		String firstPose = strArray[0];
		int i = 0;
		int[] lenArray = new int[n];
		int lenNum = 0;
		while (i < strArray.length) {
			while (i < strArray.length && firstPose.equals(strArray[i])) {
				lenArray[lenNum]++;
				i++;
			}

			while (i < strArray.length && !firstPose.equals(strArray[i])) {
				lenArray[lenNum]++;
				i++;
			}

			lenNum++;
		}
		if (strArray.length > 1) {
		if (strArray[0].equals("1")) {
			lenArray[1] += lenArray[0];
			lenArray[0] = 0;
		}
		
		if (strArray[n-1].equals("1")) {
			lenArray[lenNum - 2] += lenArray[lenNum -1];
			lenArray[lenNum -1] = 0;
		}
		}
		
		int result = 0;
		for (int j = 0; j < lenNum - k + 1; j++) {
			int tmp = 0;
			for (int l = 0; l < k; l++) {
				tmp += lenArray[l+j];
			}
			if (tmp > result) {
				result = tmp;
			}
			tmp = 0;
		}
		System.out.println(result);
		
	}

}