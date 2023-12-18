import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int m = sca.nextInt();
	int[] si = new int[m];
	int[] ci = new int[m];
	int[] ans = new int[n];
	for(int i = 0; i < n; i++) {
		ans[i] = -2;
	}
	for(int i = 0; i < m; i++) {
		si[i] = sca.nextInt();
		ci[i] = sca.nextInt();
	}

	if(n == 1) {
		ans[0] = ci[0];
	}
	else if(n == 2) {
		for(int i = 0; i < m; i++) {
			if(si[i] == 1 && ci[i] == 0) {
				ans[0] = -1;
				break;
			}
			if(ans[si[i] - 1] != ci[i] && ans[si[i] - 1] > -1) {
				ans[0] = -1;
				break;
			}
			ans[si[i] - 1] = ci[i];
		}
	}
	else {
		for(int i = 0; i < m; i++) {
			if(si[i] == 1 && ci[i] == 0) {
				ans[0] = -1;
				break;
			}
			if(ans[si[i] - 1] != ci[i] && ans[si[i] - 1] > -1) {
				ans[0] = -1;
				break;
			}
			ans[si[i] - 1] = ci[i];
		}
	}

	for(int i = 0; i < n; i++) {
		if(ans[0] == -1) {
			break;
		}
		else if(ans[i] == -2) {
			if(i == 0) {
				ans[i] = 1;
			}
			else {
				ans[i] = 0;
			}
		}
	}
	for(int i = 0; i < n; i++) {
		if(ans[0] == -1) {
			System.out.print(ans[0]);
			break;
		}
		else {
			System.out.print(ans[i]);
		}
	}
	System.out.println("");

	// 後始末
	sca.close();
	}
}