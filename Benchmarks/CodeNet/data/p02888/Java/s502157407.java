import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []d = new int [n];
		
		for(int i = 0;i < n ; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		
		int cnt = 0;
		
		for(int i = n-1 ; i > 0 ; i--) {
			for(int j = 0 ; j < n-1 ; j++) {
				for(int k = j+1 ; k < i ; k++) {
					if(i <= j) {
						break;
					}
					int temp = d[j] + d[k];
					
					if(temp > d[i]) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
