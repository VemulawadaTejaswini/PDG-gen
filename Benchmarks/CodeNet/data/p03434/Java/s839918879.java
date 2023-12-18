import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		Integer[] a = new Integer[N];
		for(int i=0; i < N; i++) {
			a[i] = sc.nextInt(); // int a[i]を受け取る
		}
		sc.close(); // 標準入力を終了

		// a[i](Integer型配列)を降順にソート
		Arrays.sort(a, Collections.reverseOrder());

		int alice = 0; // アリスの得点
		int bob = 0; // ボブの得点

		for(int i=0; i < N; i++) {
			if(i % 2 == 0) {
				// iが偶数の時は、アリスがカードを取る
				alice += a[i];
			} else {
				// iが偶数の時は、ボブがカードを取る
				bob += a[i];
			}
		}

		// alice - bobを出力
		System.out.println(alice - bob);
	}

}