import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long k = scan.nextLong();

		if(n%k==0) {
			System.out.println(0);
		}else {
			fact(n,k);
		}

	}


	public static void fact(long n,long k) {
		if(n==0) {
			System.out.println(n);
		}else if(Math.abs(n-k)>=n) {
			System.out.println(n);
		}else {
			fact(Math.abs(n-k),k);
		}
	}

}
