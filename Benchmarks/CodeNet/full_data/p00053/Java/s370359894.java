import java.util.Scanner;

public class Main {
	public static final int MAX = 10000;
	public static boolean[] isPrime = new boolean[MAX + 1];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		eratos();
		
		int n = sc.nextInt();
		while (n != 0) {
			int sum = 0, count = 0;
			for (int i = 2; ; i++) {
				if (count == n) break;
				if (isPrime[i] == true) {
					sum += i;
					count++;
				}
			}
			System.out.println(sum);
			n = sc.nextInt();
		}
	}
	
	public static void eratos() {
		for (int i = 0; i < MAX + 1; i++) {
			isPrime[i] = true;
		}
		
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= Math.sqrt(MAX); i++) {
			if (isPrime[i] == true) {
				for (int j = i + i; j <= MAX; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
}