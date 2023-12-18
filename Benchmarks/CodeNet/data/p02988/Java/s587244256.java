import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] S = new int[n];
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		for(int i = 1; i <= n - 2; i++) {
			if((S[i + 1] > S[i])){
				if(S[i] > S[i - 1]) {
					count++;
				}
			}else if((S[i + 1] < S[i])){
				if(S[i] < S[i - 1]) {
					count++;
				}
			}else {
				continue;
			}
		}
		System.out.println(count);
	}
}