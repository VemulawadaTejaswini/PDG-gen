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
			if(S.charAt(i) == 'E') {
				east++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			if(S.charAt(i) == 'E') {
				east--;
			} 
			if( i > 0) {
				if(S.charAt(i - 1) == 'W') {
					west++;
				}
			}
			sum = Math.min(sum, west + east);
		}
		System.out.println(sum);
	}
}
