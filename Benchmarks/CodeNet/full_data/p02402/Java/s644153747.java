import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ints = new int[n];
		
		for(int i = 0; i < n; i++) {
			ints[i] = sc.nextInt();
		}

		int max = ints[0];
		int min = max;
		int sum = max;
		int t = 0;

		for (int i = 1; i < n; i++) {
			t = ints[i];
			if ( max < t ) {
				max = t;
			}
			if ( min > t ) {
				min = t;
			}
			sum += t;
		}

		System.out.println(min + " " + max + " " +  sum);
		sc.close();
	}

}

