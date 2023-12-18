import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int m = sca.nextInt();
		int[] ai = new int[n];
		int sum = 0; // 総投票数
		for(int i = 0; i < n; i++) {
			ai[i] = sca.nextInt();
			sum += ai[i];
		}
		int select = 0;

		for(int i = 0; i < n; i++) {
			if(ai[i] >= sum*(1/(4.0*m))) {
				select++;
			}
		}
		if(select >= m) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		// 後始末
		sca.close();
	}
}