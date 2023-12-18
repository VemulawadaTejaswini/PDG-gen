import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}

		for (int i = 0; i < n; i++) {
			long currentSum = 0;
			// System.out.println("i "+i);
			for (int j = i; j < n; j++) {
				long a = list.get(j);
				currentSum +=a;
				// System.out.println("j "+j);
				// System.out.println("currentSum "+currentSum);
				if(currentSum==0){
					count++;
				}
			}
		}
		System.out.println(count);

	}
}
