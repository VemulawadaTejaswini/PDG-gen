import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);

		int n = sca.nextInt();
		int[] ai = new int[n];
		int ans = 0;
		int temp_1 = 0;
		int temp_2 = 0;
		String str = sca.next();
		char ch = 'a';
		for(int i = 0; i < n; i++) {
			ch = str.charAt(i);
			if(ch == '1') {
				ai[i] = 1;
			}
			else if(ch == '2') {
				ai[i] = 2;
			}
			else {
				ai[i] = 3;
			}
		}
		if(n > 2) {
		if(n % 2 == 1) {
			if(ai[0] - ai[n-1] > 0) {
				if(ai[0] - ai[n-1] == 1) {
					ans = ai[0] - ai[n-1];
				}
				else {
					for(int i = 0; i < n-1; i++) {
						if(ai[i] - ai[i+1] == 1 || ai[i] - ai[i+1] == -1) {
							ans = 0;
							break;
						}
					}
				}
			}
			else {
				if(ai[n-1] - ai[0] == 1) {
					ans = ai[n-1] - ai[0];
				}
				else {
					for(int i = 0; i < n-1; i++) {
						if(ai[i] - ai[i+1] == 1 || ai[i] - ai[i+1] == -1) {
							ans = 0;
							break;
						}
					}
				}
			}
		}
		else {
			if(ai[0] - ai[n-2] > 0) {
				if(ai[0] - ai[n-1] == 1) {
					ans = ai[0] - ai[n-2];
				}
				else {
					for(int i = 0; i < n-1; i++) {
						if(ai[i] - ai[i+1] == 1 || ai[i] - ai[i+1] == -1) {
							ans = 0;
							break;
						}
					}
				}
			}
			else {
				if(ai[n-2] - ai[0] == 1) {
					ans = ai[n-2] - ai[0];
				}
				else {
					for(int i = 0; i < n-1; i++) {
						if(ai[i] - ai[i+1] == 1 || ai[i] - ai[i+1] == -1) {
							ans = 0;
							break;
						}
					}
				}
			}
			if(ai[n-3] - ai[n-2] > 0) {
				temp_1 = ai[n-3] - ai[n-2];
			}
			else {
				temp_1 = ai[n-2] - ai[n-3];
			}
			if(ai[n-2] - ai[n-1] > 0) {
				temp_2 = ai[n-2] - ai[n-1];
			}
			else {
				temp_2 = ai[n-1] - ai[n-2];
			}
			if(temp_1 - temp_2 > 0) {
				temp_1 = temp_1 - temp_2;
			}
			else {
				temp_1 = temp_2 - temp_1;
			}
			if(ans > temp_1) {
				ans = ans - temp_1;
			}
			else {
				ans = temp_1 - ans;
			}
		}
		}
		else {
			if(ai[0] - ai[1] > 0) {
				ans = ai[0] - ai[1];
			}
			else {
				ans = ai[1] - ai[0];
			}
		}


		System.out.println(ans);

		// 後始末
		sca.close();
	}
}