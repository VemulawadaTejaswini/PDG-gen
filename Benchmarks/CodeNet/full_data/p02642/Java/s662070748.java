
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		//探索リストを作る
		int[] targets = new int[1000001];
		Arrays.fill(targets, 0);
		
		//入力配列をなめて、探索リストに対して、要素の倍数のインデックスに対してインクリメント
		//上記操作が終わったら、探索リストの要素が1のものが対象の数値
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if(targets[num] != 0) {
				targets[i] = 2;
				continue;
			}
			for(int j = num; j <= 1000000; j+=num) {
				targets[j]++;
			}
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(targets[nums[i]] == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}