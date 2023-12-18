
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int[] arr = new int[s.length()];

			int num1 = 0;
			int num2 = 0;
			int rNum = 0;
			int lNum = 0;
			boolean isR = true;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				switch(c) {
				case 'R':
					if(isR) {
	 					if(i % 2 == 0) {
							num1++;
						} else {
							num2++;
						}
					} else {
						if(rNum % 2 == 0) {
							arr[rNum] = num1;
							arr[lNum] = num2;
						} else {
							arr[rNum] = num2;
							arr[lNum] = num1;
						}
						num1 = 0;
						num2 = 0;
						isR = true;
	 					if(i % 2 == 0) {
							num1++;
						} else {
							num2++;
						}
					}
					break;
				case 'L':
					if(isR) {
						rNum = i - 1;
						lNum = i;
						isR = false;
					}
 					if(i % 2 == 0) {
						num1++;
					} else {
						num2++;
					}
				}
			}
			if(rNum % 2 == 0) {
				arr[rNum] = num1;
				arr[lNum] = num2;
			} else {
				arr[rNum] = num2;
				arr[lNum] = num1;
			}

			boolean isFirst = true;
			for (int i : arr) {
				if (!isFirst) {
					System.out.print(" ");
				}
				System.out.print(i);
				isFirst = false;
			}
			System.out.println();
		}
	}
}
