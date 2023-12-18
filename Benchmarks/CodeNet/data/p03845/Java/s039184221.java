import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt();

		ArrayList<Integer> time = new ArrayList<>();
		int sum = 0;
		for(int i = 0; i < N; i++) {
			int t = sc.nextInt();
			time.add(t);
			sum += t;
		}

		int M = sc.nextInt();

		ArrayList<Integer> numList = new ArrayList<>();
		ArrayList<Integer> timeList = new ArrayList<>();

		for(int i = 0; i < M; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			numList.add(p);
			timeList.add(x);

			int answer = sum;
			answer = answer - (time.get(p-1) - x);
			System.out.println(answer);
		}

		sc.close();

	}

}
