import java.util.Scanner;

public class Main {
	static String s = "";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long ans = 0;

		long H = sc.nextLong();
		long W = sc.nextLong();

		if(H == 1 || W == 1)
			ans = 1;
		else
			ans = ((W+1) / 2) * ((H+1) / 2) + (W/2) * (H/2);

		System.out.println(ans);

	}

}
