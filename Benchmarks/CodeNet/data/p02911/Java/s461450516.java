import java.util.ArrayList;
import java.util.Scanner;

// https://atcoder.jp/contests/abc141/tasks/abc141_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//人数
		int K = sc.nextInt();//ラウンド開始時の得点
		int Q = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<Q;i++) {
			list.add(sc.nextInt());
		}
		sc.close();


		//開始時のスコア
		int score[] = new int[N];
		for(int i=0;i<N;i++) {
			score[i] = K;
		}

		int vector[] = new int[N];
		for(int i=0;i<N;i++) {
			vector[i] = 1;
		}


		for(int i:list) {
			vector[i-1] = 0;
			for(int j=0;j<N;j++) {
				score[j] = score[j]-vector[j];
			}
			vector[i-1] = 1;
		}

		for(int i:score) {
			if(i<=0) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
