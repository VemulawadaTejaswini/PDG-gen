import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int a[] = new int[N+1];
		
		for(int i= 1; i <= N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int cnt = 0;
		
		for(int i =1; i<=N; i++) {
			Boolean flg = true;
			for(int j =1; j<=N; j++) {
				if (a[j] > a[i]/2) {
					break;
				}
				if (i != j) {
					if(a[i] % a[j] == 0) {
						flg = false;
						break;
					}
				}
			}
			if(flg)
				cnt++;
		}
				
		System.out.println(cnt);
	}
}