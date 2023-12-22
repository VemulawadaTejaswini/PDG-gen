
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
		int min = 201;
		int max = -1;

		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(lines[i]);
			if(A[i] < min) {
				min = A[i];
			}
			if(max < A[i]) {
				max = A[i];
			}
		}

		int kabu = 0;
		for(int i = 0; i < N - 1; i++) {
			if(A[i] < A[i+1] && money > 0) {
				while(money - A[i] >= 0) {
					money -= A[i];
					kabu++;
				}
			}else if(A[i] == A[i+1]) {
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

		int money2 = 1000;
		kabu = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] == min && money2 >= 0) {
				while(money2 - A[i] >= 0) {
					money2 -= A[i];
					kabu++;
				}
			}else if(A[i] == max && kabu > 0){
				while (kabu > 0) {
					kabu--;
					money2 += A[i];
				}
			}
		}

		if(money < money2) {
			System.out.println(money2);
		}else {
			System.out.println(money);
		}
	}

}
