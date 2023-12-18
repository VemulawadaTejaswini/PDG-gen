import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i=1; i<=N; i++) {
			for(int j=1 ; j<=N; j++) {
				for (int k=1; k<=N; k++) {
					cnt++;
				}
			}
		}
		System.out.print(cnt);

		System.out.println();

		sc.close();
	}
}


