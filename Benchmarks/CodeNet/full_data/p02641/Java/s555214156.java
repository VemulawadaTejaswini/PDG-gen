import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int n = scan.nextInt();
		int[] list = new int[n];
		
		
		for(int i = 0; i < n; i++) {
			list[i] = scan.nextInt();
		}
		Arrays.sort(list);
		
		int small = 1000;
		int ans = 0;
		int num = 0; 
		
		if(n != 0) {
		for(int i = list[0]; i < list[n-1]; i++) {
			boolean skip = false;
			for(int j = 0; j < n; j++) {
				if(i == list[j]) {
					skip = true;
					break;
				}
			}
			if(skip == true) {
				continue;
			}
			
			if(i > 0 && i < x) {
				ans = x - i;
			}
			else if(i > 0 && i > x) {
				ans = i - x;
			}
			else if(i == 0) {
				ans = x;
			}
			else if(i < 0) {
				ans = x + i;
				if(ans < 0) {
					ans = -1 * ans;
				}
			}
			
			if(ans < small) {
				small = ans;
				num = i;
			}
			
		
	}
		
		System.out.print(num);
		}
		else {
			System.out.print(x);
		}

}
}