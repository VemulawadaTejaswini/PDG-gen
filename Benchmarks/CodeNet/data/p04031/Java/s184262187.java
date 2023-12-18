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
		
		int ave = sum / N;
		if(sum % N != 0) {
			ave++;
		}
		
		int min = 0;
		
		for(int i = 0; i < N; i++) {
			min += (ave - a[i]) * (ave - a[i]);
		}
		System.out.println(min);
	}
}
