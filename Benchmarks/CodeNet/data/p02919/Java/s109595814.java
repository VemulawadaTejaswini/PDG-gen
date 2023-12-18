
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
			p[i] = sc.nextInt();
		}
		long sum = 0;
		for(int i = 1; i< n; i++){
			long first = p[i];
			long second = 0;
			for(int i2 = i - 1; i2 >= 0; i2--){
				long notFirst = Math.min(first, p[i2]);
				first = Math.max(first, p[i2]);
				second = Math.max(second, notFirst);
				sum += second;
			}
		}
		System.out.println(sum);
	}
}