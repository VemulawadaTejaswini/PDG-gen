import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			long[] array = new long[n];
			for (int i = 0; i<n; i++) array[i] = sc.nextLong();
			int query = sc.nextInt();
			for (int i = 0; i<query; i++) {
				System.out.println(binarySearch(array,sc.nextLong())? "1":"0");
			}
		}
	}

	static boolean binarySearch(long[] array, long target) {
		int low = 0;
		int high = array.length-1;  //最後
		
		while (low <= high) {
			//System.out.println(low + "    "+ high);
			int mid = (high + low)/2;
			if (array[mid] == target) return true;
			else if (array[mid] < target) low = mid+1;
			else high = mid-1;
		}
		return false;  //最後まで見つからなかったら
	}
}
