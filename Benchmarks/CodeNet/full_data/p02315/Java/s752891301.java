
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 着席位置：黒板向かって右から２列目の真ん中
 *
 * https://onlinejudge.u-aizu.ac.jp/#/problems/DPL_1_B
 */

class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//入力１行目
		Scanner scanner = new Scanner(br.readLine());
		int value[] = new int[scanner.nextInt()];
		int weight[] = new int[value.length];
		int maxWeight = scanner.nextInt();
		scanner.close();
		//全品物の入力
		for(int i=0; i<value.length; i++) {
			scanner = new Scanner(br.readLine());
			value[i] = scanner.nextInt();
			weight[i] = scanner.nextInt();
			scanner.close();
		}

		/*
		 * 部分問題(漸化式)
		 * i-1番目までの品物で考えた時の最適解がわかっている状態で
		 * i番目を問題の対象に追加して
		 * 0 ~ i番目の品物から
		 * 1)i番目を入れない
		 * 2)i番目を入れる
		 * 3)0 ~ i-1番目までのどれか(１つとは限らない)とi番目を入れ替える
		 * のどれが最適解かを考える
		 */
		int maxValue = 0;
		int weightSum = 0;
		//バッグに入れた品物リスト
		LinkedList<Integer> goodsList = new LinkedList<>();
		for(int i=0; i<value.length; i++) {
			//(2)に該当するかどうか
			if(weightSum +weight[i] <= maxWeight) {
				maxValue += value[i];
				weightSum += weight[i];
				goodsList.add(i);
				continue;
			}

			//(3)に該当するかどうか
			//価値の低い順にソート
			goodsList.sort(new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return value[o1] -value[o2];
				}
			});
			for(int j=0; j<goodsList.size(); j++) {
				int lowValSum = 0;
				int lowValWeightSum = 0;
				int k=0;
				//すでに追加している価値の低いものから順に見て、
				for(; k<=j; k++) {
					lowValSum += value[goodsList.get(k)];
					lowValWeightSum += weight[goodsList.get(k)];
				}
				//すでに入っている品物の方が価値が高いなら(1)に該当
				if(lowValSum > value[i]) break;
				//すでに入っている品物の方が価値が低くて重いなら入れ替えた方がいい(3)
				if(lowValWeightSum >= weight[i]) {
					for(int l=0; l<k; l++) {
						//このループ内が間違っていることになかなか気づけなかった
						int t = goodsList.removeFirst();
						maxValue -= value[t];
						weightSum -= weight[t];
					}
					maxValue += value[i];
					weightSum += weight[i];
					goodsList.add(i);
					break;
				}
			}


		}

		System.out.println(maxValue);


	}

}

