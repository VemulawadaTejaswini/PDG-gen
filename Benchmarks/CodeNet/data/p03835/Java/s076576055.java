import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int S = sc.nextInt();
		int ans = 0;
		for(int i=0; i<=K; i++) {
			for(int j=0; i+j<=K; j++) {
				for(int l=0; i+j+l<=K; l++) {
					if(i + j + l == S) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		
		

	}

}
