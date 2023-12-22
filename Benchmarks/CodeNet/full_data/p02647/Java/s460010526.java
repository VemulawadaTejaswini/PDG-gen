import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		int[] level = new int[n];

		int count = 0;
		System.arraycopy(num, 0, level, 0, n);
		for(int t = 0 ; t < k; t++) {
			for(int i = 0; i < n;i++) {
				count = 0;
				for(int j = 0; j < n; j++) {
					if(Math.abs(j - i) <= level[j]) {
						count++;
					}
				}
				num[i] = count;
			}
			System.arraycopy(num, 0, level, 0, n);
		}
		for(int i:num) {
			System.out.print(i + " ");
		}
	}
}