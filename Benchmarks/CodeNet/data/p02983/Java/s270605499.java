public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();

		int[] i = new int[R-L];
		int[] j = new int[R-L];

		for (int k=0; k < R-L; k++) {
			i[k] = L + k;
			j[k] = L + k + 1;
		}

		long result = 2000000000;
		for (int k=0; k < R-L; k++) {
			for (int m=k; m < R-L; m++) {
				result = Math.min(i[k]*j[m]%2019, result);
			}
		}

		System.out.println(result);
	}
}