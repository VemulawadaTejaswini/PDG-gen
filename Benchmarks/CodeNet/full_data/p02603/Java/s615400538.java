

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int N = Integer.parseInt(line);
		int money = 1000;

		line = sc.nextLine();
		String[] lines = line.split(" ");
		int[] A = new int[N];

		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(lines[i]);
		}

		int dummy = money;
		int kabu = 0;
		for(int i = 0; i < N - 1; i++) {
			if(A[i] < A[i+1] && money > 0) {
				while(money - A[i] >= 0) {
					money -= A[i];
					kabu++;
				}
			}else if(A[i] == A[i+1]) {
				money += kabu * A[i];
				kabu = 0;
			}else {
				while(kabu > 0) {
					kabu--;
					money += A[i];
				}
			}
		}

		while(kabu > 0) {
			kabu--;
			money += A[N-1];
		}

		System.out.println(money);
	}

}
