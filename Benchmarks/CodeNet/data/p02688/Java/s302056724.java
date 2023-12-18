import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int k = sca.nextInt();
		int[] dk = new int[k];
		boolean[] flag = new boolean[n];
		for(int i = 0; i < n; i++) {
			flag[i] = true;
		}
		int sunume_num = 0;

		for(int i = 0; i < k; i++) {
			dk[i] = sca.nextInt();
			for(int j = 0; j < dk[i]; j++) {
				sunume_num = sca.nextInt();
				flag[sunume_num-1] = false;
			}
		}

		int ans = 0;
		for(int i = 0; i < n; i++) {
			if(flag[i]) {
				ans++;
			}
		}

		System.out.println(ans);

		// 後始末
		sca.close();
	}
}