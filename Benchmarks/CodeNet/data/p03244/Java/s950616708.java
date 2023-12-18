import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] count = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == j % 2) {
					if (arr[i] == arr[j]) {
						count[i]++;
					}
				}
			}
		}
		

		
		int maxA1 = 0;
		int maxA1Value = 0;
		int maxA2 = 0;
		int maxB1 = 0;
		int maxB1Value = 0;
		int maxB2 = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				if (maxA1 < count[i]) {
					maxA2 = maxA1;
					maxA1 = count[i];
					maxA1Value = arr[i];
				} else if (maxA2 < count[i] && arr[i] != maxA1Value) {
					maxA2 = count[i];
				}
			} else {
				if (maxB1 < count[i]) {
					maxB2 = maxB1;
					maxB1 = count[i];
					maxB1Value = arr[i];
				} else if (maxB2 < count[i] && arr[i] != maxB1Value) {
					maxB2 = count[i];
				}
			}
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