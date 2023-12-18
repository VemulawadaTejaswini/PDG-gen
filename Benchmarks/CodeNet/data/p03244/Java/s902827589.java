import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] gusu = new int[10001];
		int[] kisu = new int[10001];

		Arrays.fill(gusu, 0);
		Arrays.fill(kisu, 0);

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(sc.next());
			if (i % 2 == 0) {
				gusu[num]++;
			} else {
				kisu[num]++;
			}
		}

		int gusuMax = getMax(gusu);
		int gusuMax2 = getMax2(gusu);
		int kisuMax = getMax(kisu);
		int kisuMax2 = getMax2(kisu);

		int gusuSum = 0;
		int kisuSum = 0;

		sortDesc(gusu);
		sortDesc(kisu);

		if(gusuMax != kisuMax){
			// i = 0は除く
			for (int i = 1; i < gusu.length; i++) {
				gusuSum += gusu[i];
			}

			// i = 0は除く
			for (int i = 1; i < kisu.length; i++) {
				kisuSum += kisu[i];
			}
		}else if(gusuMax2 >= kisuMax2){
			for (int i = 0; i < gusu.length; i++) {
				if(i == 1){
					continue;
				}
				gusuSum += gusu[i];
			}

			for (int i = 0; i < kisu.length; i++) {
				if(i == 0){
					continue;
				}
				kisuSum += kisu[i];
			}
		}else{
			for (int i = 0; i < gusu.length; i++) {
				if(i == 0){
					continue;
				}
				gusuSum += gusu[i];
			}

			for (int i = 0; i < kisu.length; i++) {
				if(i == 1){
					continue;
				}
				kisuSum += kisu[i];
			}
		}

		// Arrays.sort(gusu, Comparator.reverseOrder());
		// Arrays.sort(kisu, Comparator.reverseOrder());





		System.out.println(gusuSum + kisuSum);
	}

	private static int getMax(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		int max2 = arr[0]; //2番目に大きい
		int max2Index = 0;


		// 1からはじめる
		for (int i = 1; i < arr.length; i++) {
			int v = arr[i];
			if (v > max) {
				max = v;
				maxIndex = i;
				max2 = max;
				max2Index = maxIndex;
			}
		}

		return maxIndex;
	}

	// 2番目に大きい値
	private static int getMax2(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		int max2 = arr[0]; //2番目に大きい
		int max2Index = 0;


		// 1からはじめる
		for (int i = 1; i < arr.length; i++) {
			int v = arr[i];
			if (v > max) {
				max = v;
				maxIndex = i;
				max2 = max;
				max2Index = maxIndex;
			}
		}

		return max2Index;
	}

	private static void sortDesc(int[] nums) {

		Arrays.sort(nums);

		int[] numsTemp = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			numsTemp[i] = nums[nums.length - 1 - i];
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = numsTemp[i];
		}

	}
}