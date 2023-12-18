

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner=new Scanner(System.in);
		long n = scanner.nextLong();
		long a = scanner.nextLong();  //blue
		long b = scanner.nextLong();  //red
		long count=0;
		long ans=0;
		long m = n;

		while(m > 0) {
			m -= a+b;
			count++;
		}

		if(n - (a+b)*(count-1) > a) {
			ans += a;
		}else {
			ans += n - (a+b)*(count-1);
		}
		ans += a * (count-1);

		System.out.println(ans);


		scanner.close();

	}

}
