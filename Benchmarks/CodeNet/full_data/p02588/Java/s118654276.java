import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	double[] arr = new double[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextDouble();
	}
	System.out.println(solve(arr, n));
}

private static long solve(double[] arr, int n) {
	// TODO Auto-generated method stub
	long res = 0;
	for (int i = 0; i < n; i++) {
		for (int j = i + 1; j < n; j++) {
			if (i < j) {
				double num = arr[i] * arr[j];
				if (num % 1 == 0 && String.valueOf(num).contains(".")) {
						System.out.println(num);
						res++;
					}	
				}
			}
		}
		return res;
	}

}
