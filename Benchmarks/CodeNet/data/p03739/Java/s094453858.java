import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i=0; i<n; i++) ar[i] = sc.nextInt();
		
		//偶数項を正としたときの操作回数minA
		long minA = 0;
		long sumA = 0;
		for (int i=0; i<n; i++) {
			sumA += ar[i];
			if (i%2 == 0) {
				if (sumA <= 0) {
					minA += Math.abs(sumA) + 1;
					sumA += Math.abs(sumA) + 1;
				}
			}
			else { //sumA -
				if (sumA >= 0) {
					minA += Math.abs(sumA) + 1;
					sumA -= Math.abs(sumA) + 1;
				}
			}
		}
		
		//奇数項を正としたときの操作回数minB
		long minB = 0;
		long sumB = 0;
		for (int i=0; i<n; i++) {
			sumB += ar[i];
			if (i%2 != 0) {
				if (sumB <= 0) {
					minB += Math.abs(sumB) + 1;
					sumB += Math.abs(sumB) + 1;
				}
			}
			else {
				if (sumB >= 0) {
					minB += Math.abs(sumB) + 1;
					sumB -= Math.abs(sumB) + 1;
				}
			}
		}
		
		System.out.println(Math.min(minA, minB));
		
	}
}