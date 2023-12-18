import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int n = sca.nextInt();
	int m = sca.nextInt();
	int[] si = new int[m];
	int[] ci = new int[m];
	for(int i = 0; i < m; i++) {
		si[i] = sca.nextInt();
		ci[i] = sca.nextInt();
	}
	int[] ans = new int[n];
	for(int i = 0; i < n; i++) {
		ans[i] = -2;
	}

	for(int i = 0; i < m; i++) {
		if(si[i] == 1 && ci[i] == 0 && n != 1) {
			ans[0] = -1;
			break;
		}
		if(ans[si[i] - 1] != ci[i] && ans[si[i] - 1] > -1) {
			ans[0] = -1;
			break;
		}
		ans[si[i] - 1] = ci[i];
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
	int ten = 1;
	int ans_sin = 0;
	for(int i = n-1; i >= 0; i--) {
		if(ans[0] == -1) {
			ans_sin = -1;
			break;
		}
		ans_sin += ans[i]*ten;
		ten = ten * 10;
	}
	System.out.println(ans_sin);

	// 後始末
	sca.close();
	}
}