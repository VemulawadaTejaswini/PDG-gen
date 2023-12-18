import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// ソート
		int maxv = a;
		int midv = b;
		int minv = c;
		int tmp;
		if (maxv < midv) {
			tmp = midv;
			midv = maxv;
			maxv = tmp;

		}
		if (midv < minv) {
			tmp = midv;
			midv = minv;
			minv = tmp;
		}
		if (maxv < midv) {
			tmp = midv;
			midv = maxv;
			maxv = tmp;
		}
		// 計測
		int cnt = 0;
		while (midv < maxv) {
			midv++;
			minv++;
			cnt++;
		}
		while(minv<midv) {
			minv+=2;
			cnt++;
		}
		if(minv>maxv) {
			maxv++;
			midv++;
			cnt++;
		}
		System.out.println(cnt);
	}
}
