
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1000000;
		int max = 0;
		int countMax = 0;
		int count = 0;
		int N = scan.nextInt();
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		for(int i = min; i <= max; i++) {
			for(int j = 0; j < N; j++) {
				if(a[j] == i - 1 || a[j] == i || a[j] == i + 1) {
					count++;
				}
			}
			countMax = Math.max(count, countMax);
			count = 0;
		}
		System.out.println(countMax);
		scan.close();

	}

}
