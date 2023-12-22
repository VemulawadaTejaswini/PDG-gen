import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if(n == 0 && r == 0)
				break;
			int[] num = new int[n];
			for(int i = 0, j = n; i < num.length; i++, j--)
				num[i] = j;

			for(int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for(int j = 0; j < c; j++) {
						int temp = num[p + c - 2];
					for(int k = p + c - 2; k > 0; k--) {
						num[k] = num[k - 1];
						num[k - 1] = temp;
					}
				}
			}
			System.out.println(num[0]);
		}
	}
}