import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		int E = Integer.parseInt(sc.next());
		sc.close();

		int time = Integer.MAX_VALUE;
		int[] list = {A, B, C, D, E};

		for(int i = 0; i < factorial(5); i++) {
			int tmp = 0;
			for(int j = 0; j < list.length; j++) {
				tmp += list[j];
				if(j == list.length - 1) {
					
				}else {
					if(tmp % 10 == 0) {
						continue;
					}else {
						tmp += 10 - tmp % 10;
					}
				}
			}
			time = Math.min(time, tmp);
			next_permutation(list, 0, list.length);
		}
		System.out.println(time);
	}

	//階乗
	static int factorial(int num) {
		if(num == 0) return 1;

		return num * factorial(num - 1);
	}

	//順列を網羅するメソッド
	static boolean next_permutation(int[] array, int start, int end) {
		if(array == null || start > end || start < 0 || end > array.length) {
			return false;
		}
		for(int i=end-2; i>=start; i--) {
			if(array[i] < array[i+1]) {
				int j = end - 1;
				while(array[i] >= array[j]) {
					j--;
				}

				//swap
				int tmp = array[j];
				array[j] = array[i];
				array[i] = tmp;

				Arrays.sort(array, i+1, end);

				return true;
			}
		}

		return false;
	}
}