import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		Arrays.sort(a);
		
		int ave1 = 0;
		int ave2 = 0;
		if(sum % N == 0) {
			ave1 = sum / N;
		} else {
			ave1 = sum / N + 1;
			ave2 = sum / N;
		}
		
		int min1 = 0;
		int min2 = 0;
		
		for(int i = 0; i < N; i++) {
			min1 += (ave1 - a[i]) * (ave1 - a[i]);
		}
		
		int min = 0;
		
		if(sum % N != 0) {
			for(int i = 0; i < N; i++) {
				min2 += (ave2 - a[i]) * (ave2 - a[i]);
			}
			min = Math.min(min1, min2);
		}
		
		if(sum % N == 0) {
			min = min1;
		}
		System.out.println(min);
	}
}
