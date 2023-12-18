
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(l);
			l++;
		}
		
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (min > Math.abs(list.get(i))) {
				min = Math.abs(list.get(i));
				index = i;
			}
		}
		
		list.remove(index);
		int sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		
		System.out.println(sum);
	}
}