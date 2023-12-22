import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		long[] array = new long[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextLong();
		}
		long ans = 0;
		long divide = (long) (Math.pow(10, 9) + 7);
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				ans += (array[i] * array[j]) % divide;
			}
		}

		System.out.println(ans % divide);
		sc.close();
	}
}


