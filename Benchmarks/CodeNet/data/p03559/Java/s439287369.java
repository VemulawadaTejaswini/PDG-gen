import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] lineA = sc.nextLine().split(" ", n);
		String[] lineB = sc.nextLine().split(" ", n);
		String[] lineC = sc.nextLine().split(" ", n);
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		int[] arrC = new int[n];
		for (int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(lineA[i]);
			arrB[i] = Integer.parseInt(lineB[i]);
			arrC[i] = Integer.parseInt(lineC[i]);
		}
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		Arrays.sort(arrC);
		int idxA = 0;
		int idxC = n - 1;
		long[] sumsA = new long[n];
		for (int i = 0; i < n; i++) {
			while (idxA < n - 1 && arrA[idxA + 1] < arrB[i]) {
				idxA++;
			}
			sumsA[i] = idxA + 1;
		}
		long[] sumsC =  new long[n];
		for (int i = n - 1; i >= 0; i--) {
			while (idxC > 0 && arrC[idxC - 1] > arrB[i]) {
				idxC--;
			}
			sumsC[i] = n - idxC;
		}
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += sumsA[i] * sumsC[i];
		}
		System.out.println(total);
	}
}
