import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] aPrice = new int[a];
		for(int i = 0; i<a;i++) {
			aPrice[i] = sc.nextInt();
		}
		int[] aPrice2 = aPrice.clone();
		Arrays.sort(aPrice2);
		int[] bPrice = new int[b];
		for(int i = 0; i<b;i++) {
			bPrice[i] = sc.nextInt();
		}
		int[] bPrice2 = bPrice.clone();
		Arrays.sort(bPrice2);
		int min = aPrice2[0] + bPrice2[0];
		for(int i =0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int price = aPrice[x-1] + bPrice[y-1] -c;
			if(price < min) {
				min = price;
			}
		}

		System.out.println(min);
	}
}