import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			long[] array = new long[n];
			for (int i = 0; i<n; i++) array[i] = sc.nextLong();
			int query = sc.nextInt();
			for (int i = 0; i<query; i++) {
				Long k = sc.nextLong();
				if (k > array[n - 1]) System.out.println(n + " " + n);
				else {
					System.out.println(lowerBound(array,k) + " " + upperBound(array,k));
				}
			}
		}
	}

	static int lowerBound(long[] array, long target) {
		int low = 0;
		int high = array.length-1;  //最後

		while (low < high) {
			//System.out.println(low + "    "+ high);
			int mid = (high + low)/2;
			if (array[mid] == target) {
				while ((mid != 0)&&(array[mid - 1] == target)) mid--;  //前がある場合移動
				return mid;
			}
			else if (array[mid] < target) low = mid + 1;
			else high = mid;
		}
		while ((high != 0)&&(array[high - 1] == array[high])) high--;  //前がある場合移動
		return high;
	}

	static int upperBound(long[] array, long target) {
		int low = 0;
		int high = array.length-1;  //最後

		if (array[high] <= target) return array.length;  //targetより大きい数値が存在しない場合nをreturn

		while (low < high) {
			//System.out.println(low + "    "+ high);
			int mid = (high + low)/2;
			if (array[mid] <= target) low = mid + 1;
			else high = mid;
		}
		while ((high != 0)&&(array[high - 1] == array[high])) high--;  //前がある場合移動
		return high;
	}
}
