import java.util.Scanner;
import java.util.Arrays;

public class Main {
	private int[] a;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if ((n | k) == 0) break;
			
			boolean flag = false;
			boolean zeroUsed = false;
			boolean insortZero = false;
			
			a = new int[k];
			int p;
			for (int i = 0; i < k; i++) {
				p = scan.nextInt();
				if (p != 0) {
					a[i] = p;
				}else {
					k--;
					i--;
					flag = true;
				}
			}
			
			Arrays.sort(a);
			
			int count = 1, max = 0;
			if (!flag) {
				for (int i = 1; i < k; i++) {
					if (a[i] - a[i - 1] == 1) {
						count++;
					}else {
						max = Math.max(count, max);
						count = 1;
					}
				}
			}else {
				for (int i = 0; i < k; i++) {
					if (i == 0) {
						if (a[i] == 2) {
							count++;
							zeroUsed = true;
						}
					}else if (a[i] - a[i - 1] == 1) {
						count++;
					}else if (insortZero) {
						count++;
						i--;
						insortZero = false;
					}else if (a[i] - a[i - 1] == 2 && !zeroUsed) {
						count += 2;
						zeroUsed = true;
						insortZero = true;
					}else {
						max = Math.max(count, max);
						count = 1;
						zeroUsed = false;
					}
				}
			}
			
			System.out.println(max);
		}
	}

}