import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Long> receive = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			receive.add(sc.nextLong());
		}

		sc.close();

		double b = Math.pow(10, 18);
		//System.out.println(b);
		double c = 1;
		long answer = -1;

		//超えるか超えないか
		for(int i = 0; i < receive.size(); i++) {
			c *= receive.get(i);
		}


		if(b/c > 1) {
			answer = (long) c;
		}

		System.out.println(answer);
	}
}
