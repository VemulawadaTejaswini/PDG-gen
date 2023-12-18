import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long K = sc.nextInt();
		
		long[] a = new long[100001];
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x] += y;			
		}
		
		long sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			if(sum >= K) {
				System.out.println(i);
				break;
			}
		}
	}
}
