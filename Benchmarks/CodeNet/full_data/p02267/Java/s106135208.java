import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] S = new long[n];
			for(int i=0; i<n; i++) {
				S[i] = sc.nextLong();
			}
			
			long q = sc.nextLong();
			int ans = 0;
			for(int i=0; i<q; i++) {
				long T = sc.nextLong();
				for(int j=0; j<n; j++) {
					if(T == S[j]) {
						ans++;
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}	
}

