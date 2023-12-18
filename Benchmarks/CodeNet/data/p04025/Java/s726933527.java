import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int min=100 ,max=-100;
		for(int i = 0; i < N ; i++) {
			if(a[i] < min) min = a[i];
			if(a[i] > max) max = a[i];
		}

		int minSum = 200*100;
		for(; min <= max; min++) {
			int sum = 0;
			for(int j = 0; j < N; j++) {
				sum += Math.pow(a[j]- min, 2);
			}
			if(sum < minSum) {
				minSum = sum;
			}
		}

		System.out.println(minSum);
	}

}
