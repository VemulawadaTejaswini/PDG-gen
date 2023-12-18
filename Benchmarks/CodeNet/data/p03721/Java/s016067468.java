import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), a, b, sum = 0;
		int[] bucket = new int[100100];
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			bucket[a] += b;
		}

		for (int i = 0; i < 100000; i++) {
			sum += bucket[i];
			if (sum >= k) {
				System.out.println(i);
				break;
			}
		}
	}

}
