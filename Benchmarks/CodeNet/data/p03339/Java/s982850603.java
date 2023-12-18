import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		
		int west = 0;
		int east = 0;
		int sum = N;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				if(S.charAt(j) == 'W') {
					west++;
				}
			}
			for(int j = i + 1; j < N; j++) {
				if(S.charAt(j) == 'E') {
					east++;
				}
			}
			sum = Math.min(sum, west + east);
			west = 0;
			east = 0;
		}
		System.out.println(sum);
	}
}
