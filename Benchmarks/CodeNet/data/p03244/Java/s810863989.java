import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n/2];
		int[] arrB = new int[n/2];
		for (int i = 0; i < n/2; i++) {
			arrA[i] = sc.nextInt();
			arrB[i] = sc.nextInt();
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
		int maxA1 = 0;
		int maxA2 = 0;
		int maxB1 = 0;
		int maxB2 = 0;
		int countA = 0;
		int countB = 0;
		int maxA1Value = 0;
		int maxB1Value = 0;
		
		for (int i = 0; i < n / 2; i++) {
			if (i == 0) {
				countA = 1;
				countB = 1;
				continue;
			}
			if (arrA[i] == arrA[i - 1]) {
				countA++;
			} else {
				if (maxA1 < countA) {
					maxA2 = maxA1;
					maxA1 = countA;
					maxA1Value = arrA[i - 1];
				} else if (maxA2 < countA) {
					maxA2 = countA;
				}
				countA = 1;
			}
			if (arrB[i] == arrB[i - 1]) {
				countB++;
			} else {
				if (maxB1 < countB) {
					maxB2 = maxB1;
					maxB1 = countB;
					maxB1Value = arrB[i - 1];
				} else if (maxB2 < countB) {
					maxB2 = countB;
				}
				countB = 1;
			}
		}
		if (maxA1 < countA) {
			maxA2 = maxA1;
			maxA1 = countA;
			maxA1Value = arrA[n / 2 - 1];
		} else if (maxA2 < countA) {
			maxA2 = countA;
		}
		if (maxB1 < countB) {
			maxB2 = maxB1;
			maxB1 = countB;
			maxB1Value = arrB[n / 2 - 1];
		} else if (maxB2 < countB) {
			maxB2 = countB;
		}
		
		int maxA = 0;
		int maxB = 0;
		if (maxA1Value == maxB1Value) {
			if (maxA1 + maxB2 > maxA2 + maxB1) {
				maxA = maxA1;
				maxB = maxB2;
			} else {
				maxA = maxA2;
				maxB = maxB1;
			}
		} else {
			maxA = maxA1;
			maxB = maxB1;
		}
		System.out.println(n - maxA - maxB);
	}
	
	
}