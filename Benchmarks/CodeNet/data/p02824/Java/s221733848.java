import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);

	// 入力
	int n = sca.nextInt();  // n問
	long m = sca.nextLong();  // m人のジャッジ
	int v = sca.nextInt();  // v問投票できる
	int p = sca.nextInt();  // p問採用される
	long[] a = new long[n];  // n問の各スコア
	for(int i = 0; i < n; i++) {
		a[i] = sca.nextLong();
	}

	// 初期スコアの昇順にソートする
	Arrays.sort(a);

	// 初期スコアの時点で大きいものからp問目までのうち最低のスコアを基準スコアとする
	long pivot = a[n-p];

	// 初期スコアの時点で基準スコア以上の問題は採用圏内にあるためすべてカウント
	long count = p;
	long count_chk = 1;
	int index = -1;
	for(int i = n-p-1; i >= 0; i--) {
		if(pivot == a[i]) {
			count++;
			count_chk++;
		}
		else {
			index = i;
			break;
		}
	}

	// 初期スコアの時点で基準スコア未満の問題について

	for(int j = index; j >= 0; j--) {
		if((a[j] + m) == pivot) {
			if(n-count_chk < v) {

			}
			else {
				count++;
			}
		}
		else if((a[j] + m) > pivot){
			count++;
			count_chk++;
		}
	}
    // 基準点のスコア以外の問題数 < v問のときは初期スコアで基準点以上の問題のみ採用


	// 答えを出力する
	System.out.println(count);
	sca.close();
	}
}