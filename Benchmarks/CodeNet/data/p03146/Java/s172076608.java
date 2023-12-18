
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int value = s;
		List<Integer> list = new ArrayList<>();
		list.add(s);
		int ans = 1;
		boolean flag = false;
		while(!flag) {
			ans++;
			if(value % 2 == 0) {
				value /= 2;
			} else {
				value = value * 3 + 1;
			}
			for(Integer i : list) {
				if(i == value) {
					flag = true;
				}
			}
			list.add(value);
		}
		System.out.println(ans);
	}

}
