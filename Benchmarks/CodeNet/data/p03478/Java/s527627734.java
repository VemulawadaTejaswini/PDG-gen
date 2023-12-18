import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int x = i;
			int total = 0;
			while (x != 0) {
				total += x % 10;
				x /= 10;
			}
			if (total >= a && total <= b) {
				count += i;
			}
		}
		System.out.println(count);
	}
}
