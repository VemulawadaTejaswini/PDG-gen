import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			int up1 = 0, up2 = 0;
			int[] k = new int[n];
			for (int i = 0; i < n; i++) {
				k[i] = sc.nextInt();
				if (k[i] > 0){
					up1++;
					if(k[i] >= 2) {
						up2++;
					}
				}
			}
			if (up2 == 0) {
				System.out.println("NA");
			} else {
				System.out.println(up1 + 1);
			}
		}
	}
}