
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new java.util.Scanner(System.in);

		int n = scan.nextInt();
		long[] a = new long[n];


		for(int i=0;i<n;i++) {

			 a[i] = scan.nextLong();
			 if(a[i]==0) {
				 System.out.println(0);
				 return;
			 }
		}

long c =1;
for(int i=0;i<n;i++) {
	if(a[i] <= 1000000000000000000L / c)
		c *= a[i];
	else {
		System.out.println(-1);
		return;
	}
}

if(c > 1000000000000000000L)
			System.out.println(-1);
else
	System.out.println(c);

	scan.close();

	}

}
