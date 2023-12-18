import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		
		for(int a = 1; a <= N; a++) {
			for(int b = K - a; b <= N; b += K) {
				if(b <= 0) {
					continue;
				}
				for(int c = K - a; c <= N; c += K) {
					if(c <= 0) {
						continue;
					}
					if((b + c) % K == 0) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
