import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] primeNum = new int[n];
		
		for(int i = 0; i < n; i++) {
			primeNum[i] = sc.nextInt();
		}
		
		int flag = 0, cnt = 0;
		
		for(int i = 0; i < n; i++) {
			if(primeNum[i] != 2) {
				for(int j = 2; j < primeNum[i]; j++) {
					if(primeNum[i] % j == 0) {
						flag = 1;
						break;
					}
				}
			}
			
			if(flag == 0) {
				cnt++;
			}
			
			flag = 0;
		}
		
		System.out.println(cnt);
	}
}