import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int all = n;
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(n-- > 0) {
			int temp = sc.nextInt();
			array.add(temp);
			sum += temp;
		}
		long roundavg = Math.round((double)sum/all);
		int ans = 0;
		for(int i = 0; i < array.size(); i++) {
			ans += (array.get(i) - roundavg) * (array.get(i) - roundavg);
		}
		System.out.println(ans);
	}
}