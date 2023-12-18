import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array1 = new int[N];
		int[] array2 = new int[N];
		int[] array3 = new int[N];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 0) {
					array1[j] = sc.nextInt();
				} else if (i == 1) {
					array2[j] = sc.nextInt();
				} else if (i == 2) {
					array3[j] = sc.nextInt();
				}
			}
		}
		sc.close();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		Arrays.sort(array3);
		BigDecimal result = new BigDecimal(0);
		boolean setIndex2 = false;
		boolean setIndex3 = false;
		int index2 = 0;
		int index3 = 0;
		for (int i = 0; i < N; i++) {
			if (setIndex2) {
				setIndex2 = false;
				index3 = 0;
			} else if (i != 0) {
				break;
			}
			for (int j = index2; j < N; j++) {
				if (array2[j] > array1[i]) {
					if (!setIndex2) {
						index2 = j;
						setIndex2 = true;
					}
					if (setIndex3) {
						setIndex3 = false;
					} else if (i != 0) {
						break;
					}
					for (int k = index3; k < N; k++) {
						if (array3[k] > array2[j]) {
							if (!setIndex3) {
								index3 = k;
								setIndex3 = true;
							}
							result = result.add(new BigDecimal(N - k));
							break;
						}
					}
				}
			}
		}
		
		System.out.println(result);
	}
}