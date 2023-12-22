import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int [] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort(input, n);

	}

	private static void bubbleSort(int[] A, int N) {

		boolean flag = true;
		int count = 0;
		while(flag) {
			
			flag = false;
			for (int j = N-1 ; j >= 1; j--) {
				if(A[j] < A[j-1]) {
					int wk = A[j-1];
					A[j-1] = A[j];
					A[j] = wk;
					
					flag = true;
					count++;
				}
			}
		}
		show(A, " ");
		System.out.println(count);
	}

	private static void show(int[] a, String joiner) {

		String line = Arrays.stream(a)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(joiner));
		
		System.out.println(line);
		
	}
}