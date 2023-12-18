import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		int total = 0;

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N-i; j++) {
				//差分を求めてループを減らす
				int k = N - (i + j);
				total = i*10000 + j*5000 + k*1000;
				if(total == Y) {
					System.out.println(i + " " + j + " " + k);
					return;
				}
			}
		}
		System.out.println("-1 -1 -1");
	}

}