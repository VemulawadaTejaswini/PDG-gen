import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();

		int[] a = new int[n];

		for (int i = 0 ; i < n ; i++ ) {
			a[i] = sc1.nextInt();
		}

		Arrays.sort(a);

		//rの最大値
		double m = (double)a[n-1] / 2;
		//System.out.println("m=" + m);
		//rの最大値からの差分
		double c;
		//rが最大となるa
		int b = a[0];

		for (int i = 0 ; i < n-1 ; i++ ) {
			double x = m - a[i];
			c = Math.abs(x);
			if (c <= Math.abs(m-b)) {
				b = a[i];
				//System.out.println("c=" + c + ",b=" + b);
			}
		}

		System.out.println(a[n-1] + " " + b);

		sc1.close();

	}


}
