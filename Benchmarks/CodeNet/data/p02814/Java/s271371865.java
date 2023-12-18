import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	public void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] intArr = new int[n];
		
		for(int i = 0; i < n ; i++) {
			intArr[i] = sc.nextInt();
		}
		sc.close();
		
		int mod = (intArr[0] / 2) % 2;
		for(int i = 1; i < n; i++) {
			if(mod != (intArr[i] / 2) % 2) {
				System.out.println(0);
				return;
			}
		}
		
		int ans = 0;
		
		Arrays.parallelSort(intArr);
		
		for(int i = 1; i < m; i++) {
			
			boolean isBreak = false;
			int beforeNum = -1;
			
			for(int j = n - 1; j > 0; j--) {
				
				int thisNum = intArr[j];
				
				if(thisNum == beforeNum) {
					continue;
				}
				
				if((i - (thisNum/2)) < 0 || (i - (thisNum/2)) % thisNum != 0) {
					isBreak = true;
					break;
				}
				
				beforeNum = thisNum;
			}
			if(!isBreak) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
