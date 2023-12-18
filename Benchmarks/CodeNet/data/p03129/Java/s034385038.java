import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long K=sc.nextLong();


		boolean a=(1+(K-1)<=N);
		System.out.println(a?"YES":"NO");

	}

}
