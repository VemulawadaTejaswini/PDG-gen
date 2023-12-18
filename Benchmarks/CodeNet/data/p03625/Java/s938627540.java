
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] a = new Long[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextLong();
		Arrays.sort(a, new Comparator<Long>() {
			public int compare(Long x, Long y) {
				return (int)(y - x);
			}
		});
		List<Long> list = new ArrayList<>();
		for(int i = 0 ; i < n - 1 ; i++) {
			if(a[i].longValue() == a[i + 1].longValue()) {
				list.add(a[i]);
				i++;
			}
			if(list.size() == 2) {
				System.out.println(list.get(0) * list.get(1));
				return;
			}
		}
		System.out.println(0);
	}
}