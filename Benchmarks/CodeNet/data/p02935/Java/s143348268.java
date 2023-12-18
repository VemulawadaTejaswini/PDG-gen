
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Double> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextDouble());
		}
		Collections.sort(list);
		double ans = 0;
		ans += list.get(0) / Math.pow(2, n - 1);
		double div = n - 1;
		for(int i = 1; i < n; i++) {
			ans += list.get(i) / Math.pow(2, div);
			div--;
		}
		System.out.println(ans);
	}

}
