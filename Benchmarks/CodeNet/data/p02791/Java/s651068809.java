import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	// 入力

	int n = sca.nextInt();
	int[] pi = new int[n];
	for(int i = 0; i < n; i++) {
		pi[i] = sca.nextInt();
	}

	int min = 0;
	int ans = 0;
	boolean flag = true;
	for(int i = 0; i < n; i++) {
		flag = true;
		min = pi[i];
		for(int j = i; j >= 0; j--) {
			if(min > pi[j]) {
				flag = false;
				break;
			}
		}
		if(flag == true) {
			ans++;
		}
	}

	System.out.println(ans);

	// 後始末
	sca.close();
	}
}