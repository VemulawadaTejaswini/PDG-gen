
public class Main {
	public static void main(String args[]) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];

		for (int i = 0; i < N ;i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		double result = 0;
		for (int i = 0; i< N; i++) {
			for (int j = 0; j< N; j++) {
				result += Math.sqrt(Math.pow((x[i] - x[j]), 2)  + Math.pow((y[i] - y[j]), 2));
			}
		}

		int tmp = 1;
		for (int i = 0; i < N ;i++) {
			tmp = tmp*N;
		}

		System.out.println(result/N);
	}

}