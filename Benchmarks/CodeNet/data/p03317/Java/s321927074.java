
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int min = 100000;
		int minPos = 0;
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
			if (num[i] < min) {
				min = num[i];
				minPos = i;
			}
			
		}
		int cnt = 0;
	
		Boolean hasChanged = false;
		for (int i = minPos + 1; i < n; i++) {
			int len;
			hasChanged = false;
			if (i + k - 1 < n) {
				len = i + k - 1;
			}else {
				len = n;
			}
			for (int j = i; j < len; j++) {
				if (num[j] != min || j == minPos) {
					num[j] = min;
					hasChanged = true;
				}
				
			}
			i = len - 1;
			if (hasChanged) {
				cnt++;
			}
		}
		// 逆から
		for (int i = 0; i < minPos; i++) {
			int len;
			hasChanged = false;
			if (i + k - 1 < minPos) {
				len = i + k - 1;
			}else {
				len = minPos;	
			}
			for (int j = i; j < len; j++) {
				if (num[j] != min || j == minPos) {
					num[j] = min;
					hasChanged = true;
				}
				
			}
			i = len - 1;
			if (hasChanged) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		scanner.close();
	}

}
