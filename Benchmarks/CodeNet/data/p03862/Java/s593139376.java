import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int N = 0;
		int x = 0;
		int sum = 0;
		int count = 0;
		int a = 0;
		int b = 0;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		x = scan.nextInt();
		int[] array = new int[N];

		for(int i = 0; i < N; i++) {
			array[i] = scan.nextInt();
		}

		for(int j = 0; j < N - 1; j++) {
			a = array[j];
			b = array[j + 1];
			sum = a + b;
			if(sum > x) {
				if(a > b) {
					array[j] = array[j] - (sum - x);
					count += sum - x;
				}
				else if(a < b) {
					array[j + 1] = array[j + 1] - (sum - x);
					count += sum - x;
				}
				else {
					array[j + 1] = array[j + 1] - (sum - x);
					count += sum - x;
				}
			}
		}
		System.out.println(count);
	}
}