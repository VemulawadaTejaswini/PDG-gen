import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Integer> s;
	static int count;

	public static void binarySearch(int value) {
		int left = 0, right = s.size();
		while (left < right) {
			int mid = (left + right) / 2;
			if (s.get(mid).intValue() == value) {
				count++;
				break;
			} else if(value < s.get(mid)){
				right = mid;
			} else {
				left = mid + 1;
			}
			mid = (left + right) / 2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		s = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		int q = sc.nextInt();
		count = 0;
		for (int i = 0; i < q; i++) {
			binarySearch(sc.nextInt());
		}
		System.out.println(count);
	}
}
