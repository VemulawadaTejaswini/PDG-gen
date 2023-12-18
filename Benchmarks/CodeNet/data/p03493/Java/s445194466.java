import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[220];
		int num;

		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			num = sc.nextInt();
			numbers[i] = num;
		}
		sc.close();

		int cnt=0;
		String judge = "all_even";
		while(true) {

			for (int i=0; i<N; i++) {
				if (numbers[i]%2!=0) {
					judge = "has_odd";
				}
			}
			if(judge=="has_odd") break;

			for (int i=0; i<N; i++) {
				numbers[i]/=2;
			}

			cnt ++;
		}
		System.out.println(cnt);


	}

}