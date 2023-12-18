import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたコンストラクター・スタブ
		Scanner scanner = new Scanner(System.in);

		int cn = scanner.nextInt();
		int okashi = scanner.nextInt();
		int[] a = new int[cn];
		for(int i = 0; i < cn; i++) {
			a[i] = scanner.nextInt();
		}

		Arrays.sort(a);

		int i,all = 0;
		for(i = 0; i < cn; i++) {
			all += a[i];
			if(okashi < all) {
				break;
			}
		}
		if(all < okashi) {
			i--;
		}
		System.out.println(i);
		scanner.close();

	}

}